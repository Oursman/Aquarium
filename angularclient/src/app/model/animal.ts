import {Bassin} from "./bassin";
import {Espece} from "./espece";

export class Animal {
  id : number;
  nom : string;
  sexe : string;
  signeDistinctif : Date;
  startDate : Date;
  endDate : Date;
  bassin : Bassin;
  espece : Espece;

}
