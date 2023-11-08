package org.example.behavioral_patterns.iterator_design_pattern;

public class CollectionOfNames implements Container {
    public static String[] names={"Alen", "Sara", "Alex"};
    @Override
    public Iterator getIterator() {
        return new CollectionOfNamesIterate();
    }
    private static class CollectionOfNamesIterate implements Iterator{
        int i;
        @Override
        public boolean hasNext() {
            return i < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[i++];
            }
            return null;
        }
    }
}
