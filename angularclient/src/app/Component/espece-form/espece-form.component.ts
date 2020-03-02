import { Component, OnInit } from '@angular/core';
import {Animal} from "../../model/animal";
import {Espece} from "../../model/espece";
import {Bassin} from "../../model/bassin";
import {ActivatedRoute, Router} from "@angular/router";
import {EspeceServiceService} from "../../service/espece-service.service";
import {BassinServiceService} from "../../service/bassin-service.service";
import {AnimalServiceService} from "../../service/animal-service.service";

@Component({
  selector: 'app-espece-form',
  templateUrl: './espece-form.component.html',
  styleUrls: ['./espece-form.component.css']
})
export class EspeceFormComponent implements OnInit {

  espece: Espece;

  ngOnInit() : void{
  }

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private especeServiceService: EspeceServiceService) {
    this.espece = new Espece();

  }

  onSubmit() {
    this.especeServiceService.save(this.espece).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/ViewsEspece']);
  }

}
