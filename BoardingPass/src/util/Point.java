package util;

public class Point {
    // Simple helper class that will be used to compute two different points
        private double latitude;
        private double longitude;

        public Point(double latitude, double longitude) {
            this.setLatitude(convertValueToRadians(latitude));
            this.setLongitude(convertValueToRadians(longitude));

        }

        // Helper function to convert degrees to radians, necessary for computing geodesic distance
        public double convertValueToRadians(double value) {
            double den = 180 / Math.PI;
            return value / den;
        }
    /*
        Compute the approximate geodesic distance between two points on earth.
        dlon = lon2 - lon1
        dlat = lat2 - lat1
        a = (sin(dlat/2))^2 + cos(lat1) * cos(lat2) * (sin(dlon/2))^2
        c = 2 * arcsin(min(1,sqrt(a)))
        d = R * c
     */

        public double getDistanceInMiles(Point other) {
            double radius = 3963;
            double lonDist = other.getLongitude() - this.getLongitude();
            double latDist = other.getLatitude() - this.getLatitude();
            double a = (Math.pow(Math.sin(latDist / 2), 2)) + Math.cos(this.getLatitude()) * Math.cos(other.getLatitude()) *
                    (Math.pow(Math.sin(lonDist / 2), 2));
            double c = 2 * Math.asin(Math.min(1, Math.sqrt(a)));
            double distance = radius * c;

            System.out.println("Computed Distance: " + distance);
            return distance;
        }

        //    <----------------------GETTERS N SETTERS-------------------------------->
        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
    }
}
