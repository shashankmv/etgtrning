import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormExample } from './FormExample';
import { FormValidation } from './FormValidation';

const routes: Routes = [
  {path:'TemplateForm',component: FormExample},
  {path:'ModelForm', component: FormValidation}
];

@NgModule({
  declarations:[],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
