import { Component, OnInit } from '@angular/core';
import {Animal} from "../../model/animal";
import {Espece} from "../../model/espece";
import {Bassin} from "../../model/bassin";
import {ActivatedRoute, Router} from "@angular/router";
import {EspeceServiceService} from "../../service/espece-service.service";
import {BassinServiceService} from "../../service/bassin-service.service";
import {AnimalServiceService} from "../../service/animal-service.service";
import {Secteur} from "../../model/secteur";
import {SecteurServiceService} from "../../service/secteur-service.service";

@Component({
  selector: 'app-bassin-form',
  templateUrl: './bassin-form.component.html',
  styleUrls: ['./bassin-form.component.css']
})
export class BassinFormComponent implements OnInit {

  bassin: Bassin;
  secteurs: Secteur[];

  ngOnInit() : void{
    this.secteurServiceService.findAll()
      .subscribe(secteur => {
        this.secteurs= secteur as Secteur[]
      });
  }

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private secteurServiceService: SecteurServiceService,
    private bassinServiceService: BassinServiceService) {
    this.bassin = new Bassin();

  }

  onSubmit() {
    this.bassinServiceService.save(this.bassin).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/ViewsBassin']);
  }
}
