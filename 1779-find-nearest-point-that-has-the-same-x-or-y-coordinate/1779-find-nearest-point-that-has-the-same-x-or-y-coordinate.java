class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        List<Integer> indexArray = new ArrayList<Integer>();
        for (int index = 0; index < points.length; index++) {
            if (points[index][0] == x || points[index][1] == y) indexArray.add(index);
        }
        int smallest = Integer.MAX_VALUE, smallestIndex = -1, distance;
        for (int index : indexArray) {
            distance = Math.abs(points[index][0] - x) + Math.abs(points[index][1] - y);
            if (distance < smallest) {
                smallest = distance;
                smallestIndex = index;
            }
        }
        return smallestIndex;
    }
}