import { WebPlugin } from '@capacitor/core';

import type { CallActivityPlugin } from './definitions';

export class CallActivityWeb extends WebPlugin implements CallActivityPlugin {
  async openActivity(_options: { package: string, activity: string }): Promise<void> {
    console.error(_options);
    throw this.unavailable('Not unavailable on web.');
  }
}
