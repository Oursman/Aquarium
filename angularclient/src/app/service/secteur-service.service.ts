import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {Secteur} from "../model/secteur";
import {Bassin} from "../model/bassin";

@Injectable()
export class SecteurServiceService {

  private urlViews: string;
  private urlAdd: string;
  private urlDelete: string;

  constructor(private http: HttpClient) {
    this.urlViews = 'http://localhost:8080/ViewsSecteur';
    this.urlAdd = 'http://localhost:8080/AddSecteur';
    this.urlDelete = 'http://localhost:8080/DeleteSecteur';
  }

  public findAll(): Observable<Secteur[]> {
    return this.http.get<Secteur[]>(this.urlViews);
  }

  public save(secteur: Secteur) {
    return this.http.post<Secteur>(this.urlAdd, secteur);
  }

  public delete(id: number): Observable<any> {
    return this.http.delete<Secteur>(this.urlDelete+"/"+id);
  }

}
