package com.coders.epsilon.medicare.utill;

public class DietChart {

	String mId = "";
	String mDate = "";
	String mTime = "";
	String mEventName = "";
	String mFoodMenu = "";
	String mAlarm = "";

	/*
	 * set id of activity
	 */

	public void setId(String eId) {
		mId = eId;
	}

	/*
	 * get id of activity
	 */
	public String getId() {
		return mId;
	}

	/*
	 * set Date of the activity
	 */
	public void setDate(String eDate) {
		mDate = eDate;
	}

	/*
	 * get Date of the activity
	 */
	public String getDate() {
		return mDate;
	}

	/*
	 * set time for the activity
	 */
	public void setTime(String eTime) {
		mTime = eTime;
	}

	/*
	 * get time of the activity
	 */
	public String getTime() {
		return mTime;
	}

	/*
	 * set food menu
	 */
	public void setFoodMenu(String eFoodMenu) {
		mFoodMenu = eFoodMenu;
	}

	/*
	 * get food menu
	 */
	public String getFoodMenu() {
		return mFoodMenu;
	}

	/*
	 * set the event name
	 */
	public void setEventName(String eEventName) {
		mEventName = eEventName;
	}

	/*
	 * get event name
	 */
	public String getEventName() {
		return mEventName;
	}

	/*
	 * set alarm for the activity
	 */
	public void setAlarm(String eAlarm) {
		mAlarm = eAlarm;
	}

	/*
	 * get alarm of the activity
	 */
	public String getAlarm() {
		return mAlarm;
	}

	/*
	 * empty constructor of this class
	 */
	public DietChart() {

	}

	/*
	 * constructor for set value
	 */
	public DietChart(String eId, String eDate, String eTime,
                     String eFoodMenu, String eEventName, String eAlarm) {
		mId = eId;
		mDate = eDate;
		mTime = eTime;
		mFoodMenu = eFoodMenu;
		mEventName = eEventName;
		mAlarm = eAlarm;
	}
}
