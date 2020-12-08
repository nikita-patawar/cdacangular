import { TestBed } from '@angular/core/testing';

import { OregisterService } from './oregister.service';

describe('OregisterService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: OregisterService = TestBed.get(OregisterService);
    expect(service).toBeTruthy();
  });
});
