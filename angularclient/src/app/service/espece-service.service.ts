import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Espece } from '../model/espece';
import { Observable } from 'rxjs/Observable';
import {Bassin} from "../model/bassin";

@Injectable()
export class EspeceServiceService {
  private urlViews: string;
  private urlAdd: string;
  private urlDelete: string;

  constructor(private http: HttpClient) {
    this.urlViews = 'http://localhost:8080/ViewsEspece';
    this.urlAdd = 'http://localhost:8080/AddEspece';
    this.urlDelete = 'http://localhost:8080/DeleteEspece';
  }

  public findAll(): Observable<Espece[]> {
    return this.http.get<Espece[]>(this.urlViews);
  }

  public save(espece: Espece) {
    return this.http.post<Espece>(this.urlAdd, espece);
  }

  public delete(id: number): Observable<any> {
    return this.http.delete<Espece>(this.urlDelete+"/"+id);
  }
}


