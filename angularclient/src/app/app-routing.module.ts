import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AnimalListComponent } from './Component/animal-list/animal-list.component';
import { AnimalFormComponent } from './Component/animal-form/animal-form.component';
import {EspeceListComponent} from "./Component/espece-list/espece-list.component";
import {SecteurListComponent} from "./Component/secteur-list/secteur-list.component";
import {BassinListComponent} from "./Component/bassin-list/bassin-list.component";
import {EspeceFormComponent} from "./Component/espece-form/espece-form.component";
import {SecteurFormComponent} from "./Component/secteur-form/secteur-form.component";
import {BassinFormComponent} from "./Component/bassin-form/bassin-form.component";
import {BassinAnimalListComponent} from "./Component/bassin-animal-list/bassin-animal-list.component";

const routes: Routes = [
  { path: 'ViewsAnimal', component: AnimalListComponent },
  { path: 'ViewsEspece', component: EspeceListComponent },
  { path: 'ViewsBassin', component: BassinListComponent },
  { path: 'ViewsSecteur', component: SecteurListComponent },
  { path: 'ViewsAnimalByBassin', component: BassinAnimalListComponent },
  { path: 'AddAnimal', component: AnimalFormComponent },
  { path: 'AddEspece', component: EspeceFormComponent },
  { path: 'AddSecteur', component: SecteurFormComponent },
  { path: 'AddBassin', component: BassinFormComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
