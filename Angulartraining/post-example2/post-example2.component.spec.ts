import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostExample2Component } from './post-example2.component';

describe('PostExample2Component', () => {
  let component: PostExample2Component;
  let fixture: ComponentFixture<PostExample2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PostExample2Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PostExample2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
