import { Component } from "@angular/core";
import {Myassign} from './Myassign';

@Component({
    selector:'my-product-com',
    templateUrl:"./proexample.html",
    template:`<div><p> 'products'={{product}} </p></div>
    <div><p> 'product prices'={{price}} </p></div>
    <div><p> 'images'={{image}}</p></div>`,
    providers:[Myassign]
})

export class MyProductComponenet{
    product=["bat","ball","wickets"];
    price=[100,50,500];
    image=['https://in.images.search.yahoo.com/images/view;_ylt=AwrwJSHVd95hpDIAlE69HAx.;_ylu=c2VjA3NyBHNsawNpbWcEb2lkAzU2NDVhYjA1Mzg2MmM4MzY0MzBiZTAxOWU1OTJiOTRiBGdwb3MDMgRpdANiaW5n?back=https%3A%2F%2Fin.images.search.yahoo.com%2Fsearch%2Fimages%3Fp%3Dcricket%2Bbat%2Bimages%26ei%3DUTF-8%26type%3DE211IN714G0%26fr%3Dmcafee%26fr2%3Dsa-gp-in.images.search%26tab%3Dorganic%26ri%3D2&w=800&h=800&imgurl=contents.mediadecathlon.com%2Fp1623082%2Fk%249cebe86a8a105117b3acdd91ca02ac06%2Fcricket-bat-ew-590-black.jpg%3F%26f%3D800x800&rurl=https%3A%2F%2Fwww.decathlon.in%2Fp%2F8536715_cricket-bat-ew-590-black.html&size=36.3KB&p=cricket+bat+images&oid=5645ab053862c836430be019e592b94b&fr2=sa-gp-in.images.search&fr=mcafee&tt=EW590+ADULTS+ENGLISH+WILLOW+POWER+CRICKET+BAT%2C+BLACK&b=0&ni=120&no=2&ts=&tab=organic&sigr=Hx_aTZT40HLd&sigb=ad5c7NNVc3MF&sigi=dRLYL8o.5w4v&sigt=kg4f1ziV4Al4&.crumb=XzsEMTdIGbg&fr=mcafee&fr2=sa-gp-in.images.search&type=E211IN714G0','https://in.images.search.yahoo.com/images/view;_ylt=AwrxhZUueN5h5z4Awre9HAx.;_ylu=c2VjA3NyBHNsawNpbWcEb2lkA2MxOTE0NWQ2OTM3N2M5ZjFlN2I5MzI4OTIxNzk1N2JjBGdwb3MDMgRpdANiaW5n?back=https%3A%2F%2Fin.images.search.yahoo.com%2Fsearch%2Fimages%3Fp%3Dcricket%2Bball%2Bimages%26ei%3DUTF-8%26type%3DE211IN714G0%26fr%3Dmcafee%26fr2%3Dsa-gp-in.images.search%26tab%3Dorganic%26ri%3D2&w=1600&h=1714&imgurl=www.upfrontcricket.com%2Fmedia%2Fcatalog%2Fproduct%2Fcache%2F1%2Fimage%2F9df78eab33525d08d6e5fb8d27136e95%2Fj%2Fn%2Fjnrleague_cb_edited-2.jpg&rurl=http%3A%2F%2Fwww.upfrontcricket.com%2Fupfront-challenger-club-cricket-ball-mens-205.html&size=419.6KB&p=cricket+ball+images&oid=c19145d69377c9f1e7b93289217957bc&fr2=sa-gp-in.images.search&fr=mcafee&tt=Opttiuuq+Junior+League+Cricket+Ball+4.75oz.+4+piece+alum+tanned+leather&b=0&ni=120&no=2&ts=&tab=organic&sigr=10zB.ixdP9aj&sigb=CCT7ob2UGOU5&sigi=7h_rNCBQaeZq&sigt=Tg8rKkK6BPSc&.crumb=XzsEMTdIGbg&fr=mcafee&fr2=sa-gp-in.images.search&type=E211IN714G0','https://in.images.search.yahoo.com/images/view;_ylt=AwrwJSE4d95hTTQAxfC9HAx.;_ylu=c2VjA3NyBHNsawNpbWcEb2lkA2MyMmM4MzU3YzgwNWFkMjQ3YThjNzRmMzFmMzMxODMwBGdwb3MDMwRpdANiaW5n?back=https%3A%2F%2Fin.images.search.yahoo.com%2Fsearch%2Fimages%3Fp%3Dwickets%2Bimages%26type%3DE211IN714G0%26fr%3Dmcafee%26fr2%3Dpiv-web%26tab%3Dorganic%26ri%3D3&w=1600&h=900&imgurl=static.sportskeeda.com%2Fwp-content%2Fuploads%2F2014%2F12%2Fstumps-1419005572-2310052.jpg&rurl=https%3A%2F%2Fwww.sportskeeda.com%2Fcricket%2Finterview-with-cricket-wicket&size=133.1KB&p=wickets+images&oid=c22c8357c805ad247a8c74f31f331830&fr2=piv-web&fr=mcafee&tt=Interview+with+cricket+wickets&b=0&ni=21&no=3&ts=&tab=organic&sigr=4srInHEuNqb0&sigb=blhywiqRFbPD&sigi=8yVwfjwuas_C&sigt=P5HZKv78YlRd&.crumb=XzsEMTdIGbg&fr=mcafee&fr2=piv-web&type=E211IN714G0'];
    
}