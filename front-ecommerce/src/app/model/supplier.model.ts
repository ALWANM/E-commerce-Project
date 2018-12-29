import {DateFormatter} from '@angular/common/src/pipes/deprecated/intl';
import {getLocaleDateTimeFormat} from '@angular/common';

export class Supplier {
    supplierID: string;
   mail: String = "";
   firstName: String = "";
   lastName: String = "";
   phoneNumber: String = "";
   dateOfBirth: Date =null;
   address: String = "";
   postalCode: String = "";
   town: String = "";
   country: String = "";
}
