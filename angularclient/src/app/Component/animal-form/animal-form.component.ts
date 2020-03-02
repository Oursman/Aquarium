import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AnimalServiceService } from '../../service/animal-service.service';
import { Animal } from '../../model/animal';
import {EspeceServiceService} from "../../service/espece-service.service";
import {Espece} from "../../model/espece";
import {BassinServiceService} from "../../service/bassin-service.service";
import {Bassin} from "../../model/bassin";

@Component({
  selector: 'app-animal-form',
  templateUrl: './animal-form.component.html',
  styleUrls: ['./animal-form.component.css']
})
export class AnimalFormComponent implements OnInit{

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
