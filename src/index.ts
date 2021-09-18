import { registerPlugin } from '@capacitor/core';

import type { CallActivityPlugin } from './definitions';

const CallActivity = registerPlugin<CallActivityPlugin>('CallActivity', {
  web: () => import('./web').then(m => new m.CallActivityWeb()),
});

export * from './definitions';
export { CallActivity };
