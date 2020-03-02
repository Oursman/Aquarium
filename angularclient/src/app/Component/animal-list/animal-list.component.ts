import { Component, OnInit } from '@angular/core';
import { Animal } from '../../model/animal';
import { AnimalServiceService } from '../../service/animal-service.service';

@Component({
  selector: 'app-animal-list',
  templateUrl: './animal-list.component.html',
  styleUrls: ['./animal-list.component.css']
})
export class AnimalListComponent implements OnInit {

  animal: Animal[];

  constructor(private animalService: AnimalServiceService) {
  }

  ngOnInit() {
    this.animalService.findAll().subscribe(data => {
      this.animal = data;
    });
  }
  OnDelete(id : number){
    this.animalService.delete(id).subscribe(result =>
      this.ngOnInit());
  }


}
