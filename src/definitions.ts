export interface RequestOpenActivity {
  /**
   * Package Name
   */
  package: string;

  /**
   * Activity Name
   */
  activity: string;
}

export interface CallActivityPlugin {
  openActivity(options: RequestOpenActivity): Promise<void>;
}
