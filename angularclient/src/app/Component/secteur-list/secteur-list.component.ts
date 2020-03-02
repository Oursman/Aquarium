import { Component, OnInit } from '@angular/core';
import {SecteurServiceService} from "../../service/secteur-service.service";
import {Secteur} from "../../model/secteur";

@Component({
  selector: 'app-secteur-list',
  templateUrl: './secteur-list.component.html',
  styleUrls: ['./secteur-list.component.css']
})
export class SecteurListComponent implements OnInit {

  secteur: Secteur[];

  constructor(private secteurServiceService: SecteurServiceService) {

  }

  ngOnInit() {
    this.secteurServiceService.findAll().subscribe(data => {
      this.secteur = data;
    });
  }

  OnDelete(id : number){
    this.secteurServiceService.delete(id).subscribe(result =>
      this.ngOnInit());
  }

}
