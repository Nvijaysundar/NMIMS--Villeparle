# Smart City Disaster Intelligence and Rescue Control System

## Project Overview

India launches a centralized Smart Disaster Intelligence and Rescue Control System to manage emergencies during:

- Floods
- Earthquakes
- Fire Accidents
- Medical Emergencies
- Building Collapses
- Cyclones
- Terrorist Attacks

The system must process lakhs of emergency requests in real time.

Students must build the complete backend system using:

- Java Collection Framework
- DSA Concepts
- OOP Concepts
- Exception Handling
- File Handling
- Multi-threading

Students should identify themselves:

- Which Collection should be used
- Which DSA concept should be used
- Which searching technique is suitable
- How to optimize time complexity
- How to improve performance



# Main Modules

1. Emergency Request Management
2. Fake Complaint Detection
3. Emergency Vehicle Route Tracking
4. VIP Route Clearance
5. Flood Rescue Team Allocation
6. Blood Donor Matching
7. Food Supply Distribution
8. Emergency Call Analysis
9. Rescue Team Performance Analysis
10. Live Disaster Monitoring Dashboard



# Module 1 - Emergency Request Management

## Scenario

Citizens continuously send emergency requests to the control room.

Each emergency request contains:

| Field | Description |
|---|---|
| Request ID | Unique emergency ID |
| Citizen Name | Person requesting help |
| Mobile Number | Contact number |
| Area | Emergency location |
| Emergency Type | Fire / Flood / Accident / Medical |
| Priority | LOW / MEDIUM / HIGH / CRITICAL |
| Time | Request time |
| Status | ACTIVE / COMPLETED |

---

## Example Data

```
ER101  Rahul   9876543210   Madhapur    Flood Rescue      HIGH
ER102  Sneha   9988776655   Miyapur     Fire Accident     CRITICAL
ER103  Arjun   9090909090   Kondapur    Medical Emergency MEDIUM
```

---

## System Requirements

The system should allow:

- Add new emergency request
- Remove completed request
- Update emergency priority
- Search emergency using ID
- Search emergency using area
- Search emergency using emergency type
- Display all active emergencies
- Display completed emergencies
- Sort emergencies based on priority
- Sort emergencies based on request time
- Count emergencies area-wise

---

## Real-Time Problem

During floods and cyclones:

- Thousands of requests may arrive within minutes
- Searching should be fast
- Duplicate IDs should not be allowed
- Priority handling should be efficient

Students must identify:

- Which Collection Framework classes are suitable
- Which searching approach is better
- How to optimize insertion and deletion



# Module 2 - Fake Complaint Detection

## Scenario

Some users create fake emergency complaints repeatedly.

Example:

```
9876543210 -> Fire Accident -> Madhapur -> 10:02
9876543210 -> Fire Accident -> Madhapur -> 10:03
9876543210 -> Fire Accident -> Madhapur -> 10:04
```

---

## System Alert

```
WARNING

Suspicious Caller Detected
Phone Number : 9876543210
Repeated Requests : 3
Time Window : 5 Minutes
```

---

## System Requirements

The system should detect:

- Repeated mobile numbers
- Repeated emergency types
- Same location repeated frequently
- Duplicate requests within short duration
- Most frequent fake emergency type

The system should generate:

- Suspicious Caller Report
- Fake Area Report
- Repeated Complaint Report

---

## Real-Time Problem

The control room receives:

- 10,000 requests continuously
- Duplicate checking must be very fast
- Frequency calculations should be optimized

Students must identify:

- Efficient duplicate detection logic
- Best data storage structure
- Best way to process continuous requests



# Module 3 - Emergency Vehicle Route Tracking

## Scenario

Ambulances and rescue vehicles continuously move across the city.

Each vehicle stores:

| Field | Description |
|---|---|
| Vehicle ID | Unique vehicle number |
| Driver Name | Driver details |
| Current Location | Current area |
| Fuel Status | Remaining fuel |
| Route History | Previously visited roads |

---

## Example Route

```
Hospital
   ↓
Road A
   ↓
Road B
   ↓
Road C
   ↓
Road D
   ↓
Road B
   ↓
Road C
   ↓
Road D
```

---

## Problem

The ambulance is moving repeatedly in circles because of GPS failure.

---

## System Requirements

The system should:

- Store route history
- Track current vehicle location
- Detect circular routes
- Detect repeated roads
- Remove completed routes
- Detect inactive vehicles

---

## Real-Time Problem

Hundreds of vehicles move continuously.

Students must identify:

- Best structure to store route movement
- Efficient route traversal logic
- Fast cycle detection mechanism



# Module 4 - VIP Route Clearance

## Scenario

VIP rescue teams travel during disasters.

Traffic department provides traffic density data.

---

## Example Traffic Data

```
20 15 10 0 0 0 5 10 25 40 0 0 0 0
```

Where:

- 0 indicates traffic-free roads
- Higher values indicate heavy traffic

---

## Visualization

```
20 15 10 0 0 0 5 10 25 40 0 0 0 0

            <---------------->

Longest Traffic-Free Segment
```

---

## System Requirements

The system should:

- Find longest traffic-free route
- Find maximum smooth road segment
- Find continuous congestion-free roads
- Detect blocked road chains

---

## Real-Time Problem

Emergency vehicles require fastest possible routes.

Students must identify:

- Efficient continuous range processing
- Best way to detect uninterrupted segments



# Module 5 - Flood Rescue Team Allocation

## Scenario

Flood rescue teams are limited.

The system must allocate nearest rescue teams immediately.

---

## Rescue Team Data

| Team ID | Area | Distance | Status |
|---|---|---|---|
| R101 | Kukatpally | 3 KM | FREE |
| R102 | Madhapur | 12 KM | BUSY |
| R103 | Gachibowli | 5 KM | FREE |
| R104 | Kondapur | 8 KM | FREE |

---

## Victim Location

```
Area : Miyapur
```

---

## Expected Result

```
Nearest Available Team Assigned

TEAM ID : R101
DISTANCE : 3 KM
```

---

## System Requirements

The system should:

- Find nearest rescue team
- Allocate fastest available team
- Remove busy teams temporarily
- Restore completed teams
- Track rescue assignments

---

## Real-Time Problem

Thousands of rescue requests may arrive simultaneously.

Students must identify:

- Efficient nearest-team retrieval
- Fast priority handling
- Dynamic team availability management



# Module 6 - Blood Donor Matching

## Scenario

Hospitals urgently need blood donors during emergencies.

---

## Donor Data

| Donor ID | Blood Group | Area |
|---|---|---|
| D101 | O- | Madhapur |
| D102 | A+ | Miyapur |
| D103 | O- | Kukatpally |
| D104 | B+ | Gachibowli |

---

## Emergency Request

```
Required Blood Group : O-
Patient Area : Hitech City
```

---

## Expected Result

```
Matched Donors

D101 -> 4 KM
D103 -> 7 KM
```

---

## System Requirements

The system should:

- Find nearest donor
- Find same blood group donors
- Remove unavailable donors
- Display active donors
- Match emergency requests quickly

---

## Real-Time Problem

50,000+ donor records may exist.

Students must identify:

- Efficient grouping technique
- Fast searching strategy
- Best structure for donor lookup



# Module 7 - Food Supply Distribution

## Scenario

Food trucks distribute food packets during floods.

---

## Food Demand Data

| Area | Demand |
|---|---|
| Madhapur | 500 |
| Kukatpally | 700 |
| Miyapur | 900 |
| Patancheru | 1200 |
| Ameenpur | 1500 |
| Beeramguda | 400 |

---

## Visualization

```
500 700 900 1200 1500 400

    <-------------------->

Continuous High Demand Region
```

---

## System Requirements

The system should:

- Track daily food distribution
- Find highest demand area
- Detect continuous high-demand regions
- Detect repeated shortages
- Track delivery efficiency

---

## Real-Time Problem

Demand changes every hour.

Students must identify:

- Efficient continuous processing technique
- Best way to track changing demand



# Module 8 - Emergency Call Analysis

## Scenario

Emergency calls arrive every minute.

---

## Call Data

| Time | Call Count |
|---|---|
| 10:00 | 20 |
| 10:01 | 25 |
| 10:02 | 40 |
| 10:03 | 60 |
| 10:04 | 80 |
| 10:05 | 100 |
| 10:06 | 30 |

---

## Visualization

```
20 25 40 60 80 100 30

    <---------------->

Emergency Spike
```

---

## System Requirements

The system should:

- Find peak emergency hours
- Detect emergency spikes
- Find longest busy duration
- Calculate average response time
- Detect sudden increases

---

## Real-Time Problem

Calls continuously increase during disasters.

Students must identify:

- Efficient continuous analysis techniques
- Best real-time processing method



# Module 9 - Rescue Team Performance Analysis

## Scenario

The government tracks rescue team performance daily.

---

## Mission Data

```
R101 -> 2
R101 -> 4
R101 -> 6
R101 -> 8
R101 -> 10
```

---

## Visualization

```
2 4 6 8 10

<------------>

Continuous Improvement
```

---

## System Requirements

The system should:

- Find best performing teams
- Detect continuously improving teams
- Rank rescue teams
- Detect weak performing areas
- Track mission streaks

---

## Real-Time Problem

Thousands of rescue operations occur daily.

Students must identify:

- Efficient ranking mechanism
- Efficient continuous tracking logic



# Module 10 - Live Disaster Monitoring Dashboard

## Scenario

The control room wants a live dashboard.

---

## Dashboard View

```
ACTIVE EMERGENCIES : 12450
ACTIVE AMBULANCES : 1240
FLOOD REQUESTS : 542
FIRE ALERTS : 88
AVAILABLE TEAMS : 40
FOOD SHORTAGES : 12
```

---

## Live Vehicle Tracking

```
AMB101 -> Madhapur
AMB102 -> Kukatpally
AMB103 -> Miyapur
```

---

## System Requirements

The dashboard should display:

- Active emergencies
- Available rescue teams
- Vehicle tracking
- Food shortages
- Blood requests
- Heat zones

---

## Real-Time Problem

Multiple departments update data simultaneously.

Students must identify:

- How to manage concurrent updates
- How to avoid inconsistent data
- How to synchronize collections safely



# Final Challenges

## Challenge 1

Detect fake callers creating 500 duplicate complaints within 3 minutes.

---

## Challenge 2

Detect ambulance circular routes automatically.

---

## Challenge 3

Find longest traffic-free emergency road.

---

## Challenge 4

Find continuously increasing emergency calls.

---

## Challenge 5

Find nearest blood donor among 50,000 records quickly.

---

## Challenge 6

Allocate nearest rescue team instantly during floods.

---

## Challenge 7

Find maximum continuous food demand region.

---

## Challenge 8

Detect inactive rescue vehicles automatically.

---

## Challenge 9

Build real-time live monitoring dashboard.

---

## Challenge 10

Optimize the entire system for minimum processing time.




# Smart City Disaster Intelligence and Rescue Control System

# Complete Sample Input And Output Flow

---

# Application Start

```
====================================================
 SMART CITY DISASTER CONTROL CENTER
====================================================

1. Emergency Request Management
2. Fake Complaint Detection
3. Vehicle Route Tracking
4. VIP Route Clearance
5. Flood Rescue Team Allocation
6. Blood Donor Matching
7. Food Supply Distribution
8. Emergency Call Analysis
9. Rescue Team Performance
10. Live Dashboard
11. Exit

Enter Your Choice :
````

---

# MODULE 1 - Emergency Request Management

## Add Emergency Request

### Input

```
Enter Request ID :
ER101

Enter Citizen Name :
Rahul

Enter Mobile Number :
9876543210

Enter Area :
Madhapur

Enter Emergency Type :
Flood Rescue

Enter Priority :
HIGH
```

### Output

```
====================================================
 Emergency Request Registered Successfully
====================================================

Request ID      : ER101
Citizen Name    : Rahul
Area            : Madhapur
Emergency Type  : Flood Rescue
Priority        : HIGH
Status          : ACTIVE
```

---

## Add Another Emergency

### Input

```
ER102
Sneha
9988776655
Miyapur
Fire Accident
CRITICAL
```

### Output

```
Emergency Request Registered Successfully
```

---

## Display Active Emergencies

### Output

```
====================================================
 ACTIVE EMERGENCIES
====================================================

ER101 -> Rahul -> Flood Rescue -> HIGH
ER102 -> Sneha -> Fire Accident -> CRITICAL
```

---

## Search Emergency By ID

### Input

```
Enter Request ID :
ER102
```

### Output

```
====================================================
 EMERGENCY FOUND
====================================================

Request ID      : ER102
Citizen Name    : Sneha
Area            : Miyapur
Emergency Type  : Fire Accident
Priority        : CRITICAL
Status          : ACTIVE
```

---

## Update Emergency Priority

### Input

```
Enter Request ID :
ER101

Enter New Priority :
CRITICAL
```

### Output

```
Priority Updated Successfully

ER101 -> Flood Rescue -> CRITICAL
```

---

## Remove Completed Emergency

### Input

```
Enter Request ID :
ER102
```

### Output

```
Emergency Marked As COMPLETED
```

---

# MODULE 2 - Fake Complaint Detection

## Sample Emergency Logs

```
9876543210 -> Fire Accident -> Madhapur -> 10:01
9876543210 -> Fire Accident -> Madhapur -> 10:02
9876543210 -> Fire Accident -> Madhapur -> 10:04
```

### Output

```
====================================================
 SUSPICIOUS CALLER DETECTED
====================================================

Phone Number       : 9876543210
Repeated Requests  : 3
Emergency Type     : Fire Accident
Area               : Madhapur
Time Window        : 5 Minutes
```

---

## Fake Area Detection

### Output

```
====================================================
 MOST REPEATED FAKE AREA
====================================================

Area Name      : Madhapur
Fake Requests  : 28
```

---

# MODULE 3 - Emergency Vehicle Route Tracking

## Vehicle Route Input

```
AMB101

Hospital
Road A
Road B
Road C
Road D
Road B
Road C
Road D
```

---

## Route Visualization

```
Hospital
   ↓
Road A
   ↓
Road B
   ↓
Road C
   ↓
Road D
   ↓
Road B
   ↓
Road C
   ↓
Road D
```

### Output

```
====================================================
 WARNING
====================================================

Circular Route Detected

Vehicle ID : AMB101

Repeated Path :
Road B -> Road C -> Road D
```

---

# MODULE 4 - VIP Route Clearance

## Traffic Data Input

```
20 15 10 0 0 0 5 10 25 40 0 0 0 0
```

---

## Visualization

```
20 15 10 0 0 0 5 10 25 40 0 0 0 0

            <---------------->

Longest Traffic Free Segment
```

### Output

```
====================================================
 BEST VIP ROUTE FOUND
====================================================

Longest Traffic-Free Distance : 4 Segments

Road Segment :
0 0 0 0
```

---

# MODULE 5 - Flood Rescue Team Allocation

## Rescue Team Data

```
R101 -> Kukatpally -> 3 KM -> FREE
R102 -> Madhapur -> 12 KM -> BUSY
R103 -> Gachibowli -> 5 KM -> FREE
R104 -> Kondapur -> 8 KM -> FREE
```

---

## Victim Location

```
Miyapur
```

### Output

```
====================================================
 RESCUE TEAM ASSIGNED
====================================================

Team ID      : R101
Distance     : 3 KM
Status       : ALLOCATED
```

---

# MODULE 6 - Blood Donor Matching

## Donor Database

```
D101 -> O- -> Madhapur
D102 -> A+ -> Miyapur
D103 -> O- -> Kukatpally
D104 -> B+ -> Gachibowli
```

---

## Emergency Blood Request

```
Required Blood Group : O-
Patient Area         : Hitech City
```

### Output

```
====================================================
 MATCHED DONORS
====================================================

D101 -> Madhapur -> 4 KM
D103 -> Kukatpally -> 7 KM
```

---

# MODULE 7 - Food Supply Distribution

## Daily Demand Data

```
500 700 900 1200 1500 400
```

---

## Visualization

```
500 700 900 1200 1500 400

    <-------------------->

Continuous High Demand Region
```

### Output

```
====================================================
 HIGH DEMAND REGION DETECTED
====================================================

Maximum Continuous Demand : 4300

Areas Included :
Miyapur
Patancheru
Ameenpur
```

---

# MODULE 8 - Emergency Call Analysis

## Emergency Call Data

```
20 25 40 60 80 100 30
```

---

## Visualization

```
20 25 40 60 80 100 30

    <---------------->

Emergency Spike
```

### Output

```
====================================================
 EMERGENCY SPIKE DETECTED
====================================================

Peak Duration : 10:02 AM to 10:05 AM

Highest Calls : 100
Average Calls : 61
```

---

# MODULE 9 - Rescue Team Performance Analysis

## Mission Data

```
R101 -> 2
R101 -> 4
R101 -> 6
R101 -> 8
R101 -> 10
```

---

## Visualization

```
2 4 6 8 10

<------------>

Continuous Improvement
```

### Output

```
====================================================
 BEST PERFORMING TEAM
====================================================

Team ID              : R101
Mission Improvement  : CONTINUOUS
Highest Missions     : 10
```

---

# MODULE 10 - Live Disaster Monitoring Dashboard

## Dashboard Output

```
====================================================
 LIVE DISASTER DASHBOARD
====================================================

ACTIVE EMERGENCIES    : 12450
ACTIVE AMBULANCES     : 1240
FLOOD REQUESTS        : 542
FIRE ALERTS           : 88
AVAILABLE TEAMS       : 40
FOOD SHORTAGES        : 12

====================================================
 LIVE VEHICLE TRACKING
====================================================

AMB101 -> Madhapur
AMB102 -> Kukatpally
AMB103 -> Miyapur

====================================================
 EMERGENCY HEAT ZONES
====================================================

Madhapur      -> HIGH
Miyapur       -> CRITICAL
Patancheru    -> MEDIUM
```



