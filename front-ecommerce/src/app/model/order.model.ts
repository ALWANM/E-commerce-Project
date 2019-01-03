import {Shippinginfo} from './shippinginfo.model';
import {User} from './user.model';
import {Payment} from './payment.model';

export class Order {
  id: string;
  date: String = "";
  amont: Float32Array;
  shippingInfo: Shippinginfo;
  user: User;
  payment: Payment;
  }
