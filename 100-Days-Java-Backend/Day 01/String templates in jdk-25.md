## String Templates — IMPORTANT NOTE

String Templates (STR."...") were preview only — removed later

| Java Version | Status of String Templates 
| ------------ | --------------------------- 
| **Java 21**  | ✔ Preview (1st)             
| **Java 22**  | ✔ Preview (2nd)             
| **Java 23**  | ✔ Preview (3rd — LAST time) 
| **Java 24**  | ❌ Removed from JDK         
| **Java 25**  | ❌ Not supported            

➡️ String Templates DO NOT work in Java 24 or Java 25.

➡️ If you want STR."Hello {name}", use JDK 23 (or 21/22/23).

➡️ In Java 25, this feature does NOT exist — no settings can enable it.

**Why it fails in Java 25**

Even with:

JDK 25 installed

Language level: Preview

--enable-preview

You will still get errors because:

The entire String Template feature was removed from the spec after Java 23.
