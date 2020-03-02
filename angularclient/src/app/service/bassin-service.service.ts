import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {Bassin} from "../model/bassin";
import {Animal} from "../model/animal";

@Injectable()
export class BassinServiceService {

  private urlViews: string;
  private urlAdd: string;
  private urlDelete: string;

  constructor(private http: HttpClient) {
    this.urlViews = 'http://localhost:8080/ViewsBassin';
    this.urlAdd = 'http://localhost:8080/AddBassin';
    this.urlDelete = 'http://localhost:8080/DeleteBassin';
  }

  public findAll(): Observable<Bassin[]> {
    return this.http.get<Bassin[]>(this.urlViews);
  }

  public save(bassin: Bassin) {
    return this.http.post<Bassin>(this.urlAdd, bassin);
  }

  public delete(id: number): Observable<any> {
    return this.http.delete<Bassin>(this.urlDelete+"/"+id);
  }

}
