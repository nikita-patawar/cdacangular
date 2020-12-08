import { TestBed } from '@angular/core/testing';

import { MoreinfoService } from './moreinfo.service';

describe('MoreinfoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MoreinfoService = TestBed.get(MoreinfoService);
    expect(service).toBeTruthy();
  });
});
