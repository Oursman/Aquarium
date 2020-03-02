import { Component, OnInit } from '@angular/core';
import {Espece} from "../../model/espece";
import {ActivatedRoute, Router} from "@angular/router";
import {EspeceServiceService} from "../../service/espece-service.service";
import {Secteur} from "../../model/secteur";
import {SecteurServiceService} from "../../service/secteur-service.service";

@Component({
  selector: 'app-secteur-form',
  templateUrl: './secteur-form.component.html',
  styleUrls: ['./secteur-form.component.css']
})
export class SecteurFormComponent implements OnInit {

  secteur: Secteur;

  ngOnInit() : void{
  }

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private secteurServiceService: SecteurServiceService) {
    this.secteur = new Secteur();

  }

  onSubmit() {
    this.secteurServiceService.save(this.secteur).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/ViewsSecteur']);
  }

}
