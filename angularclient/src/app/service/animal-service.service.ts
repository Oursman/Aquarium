import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Animal } from '../model/animal';
import { Observable } from 'rxjs/Observable';
import {Bassin} from "../model/bassin";

@Injectable()
export class AnimalServiceService {

  private urlViews: string;
  private urlViewsBassin: string;
  private urlDeleteAnimal: string;
  private urlAdd: string;

  constructor(private http: HttpClient) {
    this.urlViews = 'http://localhost:8080/ViewsAnimal';
    this.urlAdd = 'http://localhost:8080/AddAnimal';
    this.urlViewsBassin = 'http://localhost:8080/ViewsAnimalByBassin';
    this.urlDeleteAnimal = 'http://localhost:8080/DeleteAnimal';

  }

  public findAll(): Observable<Animal[]> {
    return this.http.get<Animal[]>(this.urlViews);
  }

  public getBassin(id: number): Observable<Animal[]>  {
    return this.http.get<Animal[]>(this.urlViewsBassin+"/"+id);
  }

  public save(user: Animal) {
    return this.http.post<Animal>(this.urlAdd, user);
  }

  public delete(id: number): Observable<any> {
    return this.http.delete<Animal>(this.urlDeleteAnimal+"/"+id);
  }

}
