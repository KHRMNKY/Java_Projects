import datetime
import re
import google.auth
from google.oauth2.credentials import Credentials
from googleapiclient.discovery import build

# Authenticate Google API credentials
creds = Credentials.from_authorized_user_file('token.json', ['https://www.googleapis.com/auth/calendar'])
# Connect to Google Calendar API
service = build('calendar', 'v3', credentials=creds)
# Get events from email data
def get_events_from_email(subject, body):
    start_time = datetime.datetime.now()
    end_time = start_time + datetime.timedelta(hours=1)
    event = {
        'summary': subject,
        'location': '',
        'description': body,
        'start': {
            'dateTime': start_time.strftime('%Y-%m-%dT%H:%M:%S'),
            'timeZone': 'America/New_York',
        },
        'end': {
            'dateTime': end_time.strftime('%Y-%m-%dT%H:%M:%S'),
            'timeZone': 'America/New_York',
        },
        'reminders': {
            'useDefault': True,
        },
    }
    return service.events().insert(calendarId='primary', body=event).execute()
# Check email for appointment data
def check_email_for_appointments():
    # code to check email
    for msg in messages:
        if 'appointment' in msg['subject'].lower():
            # extract appointment data from email body
            subject = msg['subject']
            body = msg['body']
            # create event in Google Calendar
            get_events_from_email(subject, body)