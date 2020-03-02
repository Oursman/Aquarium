import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from "./app-routing.module";
import { FormsModule} from "@angular/forms";
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AnimalListComponent } from './Component/animal-list/animal-list.component';
import { AnimalFormComponent } from './Component/animal-form/animal-form.component';
import { AnimalServiceService } from './service/animal-service.service';
import {EspeceServiceService} from "./service/espece-service.service";
import { EspeceListComponent } from './Component/espece-list/espece-list.component';
import { BassinListComponent } from './Component/bassin-list/bassin-list.component';
import { SecteurListComponent } from './Component/secteur-list/secteur-list.component';
import {BassinServiceService} from "./service/bassin-service.service";
import {SecteurServiceService} from "./service/secteur-service.service";
import { EspeceFormComponent } from './Component/espece-form/espece-form.component';
import { SecteurFormComponent } from './Component/secteur-form/secteur-form.component';
import { BassinFormComponent } from './Component/bassin-form/bassin-form.component';
import { BassinAnimalListComponent } from './Component/bassin-animal-list/bassin-animal-list.component';
import { AnimalModifyFormComponent } from './Component/animal-modify-form/animal-modify-form.component';


@NgModule({
  declarations: [
    AppComponent,
    AnimalListComponent,
    AnimalFormComponent,
    EspeceListComponent,
    BassinListComponent,
    SecteurListComponent,
    EspeceFormComponent,
    SecteurFormComponent,
    BassinFormComponent,
    BassinAnimalListComponent,
    AnimalModifyFormComponent,
  ],
    imports: [
      BrowserModule,
      AppRoutingModule,
      HttpClientModule,
      FormsModule
    ],
  providers: [AnimalServiceService,EspeceServiceService,BassinServiceService,SecteurServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
