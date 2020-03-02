import { Component, OnInit } from '@angular/core';
import {AnimalServiceService} from "../../service/animal-service.service";
import {Espece} from "../../model/espece";
import {EspeceServiceService} from "../../service/espece-service.service";

@Component({
  selector: 'app-espece-list',
  templateUrl: './espece-list.component.html',
  styleUrls: ['./espece-list.component.css']
})
export class EspeceListComponent implements OnInit {

  espece: Espece[];

  constructor(private especeServiceService: EspeceServiceService) {

  }

  ngOnInit() {
    this.especeServiceService.findAll().subscribe(data => {
      this.espece = data;
    });
  }

  OnDelete(id : number){
    this.especeServiceService.delete(id).subscribe(result =>
      this.ngOnInit());
  }

}
