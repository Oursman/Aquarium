import { Component, OnInit } from '@angular/core';
import {Animal} from "../../model/animal";
import {Espece} from "../../model/espece";
import {Bassin} from "../../model/bassin";
import {ActivatedRoute, Router} from "@angular/router";
import {EspeceServiceService} from "../../service/espece-service.service";
import {BassinServiceService} from "../../service/bassin-service.service";
import {AnimalServiceService} from "../../service/animal-service.service";

@Component({
  selector: 'app-bassin-animal-list',
  templateUrl: './bassin-animal-list.component.html',
  styleUrls: ['./bassin-animal-list.component.css']
})
export class BassinAnimalListComponent implements OnInit {

  animal: Animal;
  animals : Animal[];
  bassins : Bassin[];
  idBassin : number;

  ngOnInit() : void{
    this.bassinServiceService.findAll()
      .subscribe(bassin => {
        this.bassins = bassin as Bassin[]
      })
  }

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private bassinServiceService: BassinServiceService,
    private animalServiceService: AnimalServiceService) {
    this.animal = new Animal();

  }

  onSubmit() {
    this.animalServiceService.getBassin(this.idBassin).subscribe(result =>{
      this.animals = result as Animal[]
      this.ngOnInit();
    })
  }


}
