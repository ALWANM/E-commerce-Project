import { Routes, RouterModule } from "@angular/router";

import { ProfileComponent } from "./components/profile/profile.component";

import { UrlPermission } from "./urlPermission/url.permission";

import { LoginComponent } from "./components/login/login.component";

import { RegisterComponent } from "./components/register/register.component";

const appRoutes: Routes = [
  { path: 'profile', component: ProfileComponent ,canActivate: [UrlPermission] },
  // { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  {path: 'login',component:LoginComponent },

  // otherwise redirect to profile
  { path: '**', redirectTo: '/login' }
];

export const routing = RouterModule.forRoot(appRoutes);