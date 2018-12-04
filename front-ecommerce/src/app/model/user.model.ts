import {DateFormatter} from '@angular/common/src/pipes/deprecated/intl';
import {getLocaleDateTimeFormat} from '@angular/common';

export class User {
   id: string;
   mail: String = "";
   firstName: String = "";
   lastName: String = "";
   role: String = "";
   phoneNumber: String = "";
   dateOfBirth: Date =null;
   address: String = "";
   postalCode: String = "";
   town: String = "";
   country: String = "";
   gender: String = "";
   password: String = "";
}
