import { Component, OnInit } from '@angular/core';
import {Animal} from "../../model/animal";
import {Espece} from "../../model/espece";
import {Bassin} from "../../model/bassin";
import {ActivatedRoute, Router} from "@angular/router";
import {EspeceServiceService} from "../../service/espece-service.service";
import {BassinServiceService} from "../../service/bassin-service.service";
import {AnimalServiceService} from "../../service/animal-service.service";

@Component({
  selector: 'app-animal-modify-form',
  templateUrl: './animal-modify-form.component.html',
  styleUrls: ['./animal-modify-form.component.css']
})
export class AnimalModifyFormComponent implements OnInit {

  animal: Animal;
  especes: Espece[];
  bassins : Bassin[];

  ngOnInit() : void{
    this.especeServiceService.findAll()
      .subscribe(espece => {
        this.especes= espece as Espece[]
      });
    this.bassinServiceService.findAll()
      .subscribe(bassin => {
        this.bassins = bassin as Bassin[]
      })
  }

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private especeServiceService: EspeceServiceService,
    private bassinServiceService: BassinServiceService,
    private animalServiceService: AnimalServiceService) {
    this.animal = new Animal();

  }

  onSubmit() {
    this.animalServiceService.save(this.animal).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/ViewsAnimal']);
  }


}
