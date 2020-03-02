import { Component, OnInit } from '@angular/core';
import {Bassin} from "../../model/bassin";
import {BassinServiceService} from "../../service/bassin-service.service";

@Component({
  selector: 'app-bassin-list',
  templateUrl: './bassin-list.component.html',
  styleUrls: ['./bassin-list.component.css']
})
export class BassinListComponent implements OnInit {

  bassins: Bassin[];

  constructor(private bassinService: BassinServiceService) {
  }

  ngOnInit() {
    this.bassinService.findAll().subscribe(data => {
      this.bassins = data;
    });
  }

  OnDelete(id : number){
    this.bassinService.delete(id).subscribe(result =>
      this.ngOnInit());
  }

}
