import {Shippinginfo} from './shippinginfo.model';
import {User} from './user.model';
import {Payment} from './payment.model';

export class Order {
  id: string;
  date: Date;
  amount: number;
  shippingInfo: String;
  user: String="";
  payment: String;
  }
