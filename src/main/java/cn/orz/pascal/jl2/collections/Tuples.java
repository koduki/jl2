/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.orz.pascal.jl2.collections;

import java.io.Serializable;
import java.util.Objects;

/**
 * Tuple types.
 *
 * @author koduki
 */
public interface Tuples {

    /**
     * Tuple interface.
     */
    public interface Tuple extends Serializable {
    }

    /**
     * A tuple of 2 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     */
    public static class Tuple2<T1, T2> implements Tuple {

        private final T1 _1;
        private final T2 _2;

        /**
         * Create Tuple2.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         */
        public Tuple2(T1 _1, T2 _2) {
            this._1 = _1;
            this._2 = _2;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple2<?, ?> other = (Tuple2<?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ")";
        }
    }

    /**
     * A tuple of 3 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     */
    public static class Tuple3<T1, T2, T3> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;

        /**
         * Create Tuple3.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         */
        public Tuple3(T1 _1, T2 _2, T3 _3) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple3<?, ?, ?> other = (Tuple3<?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ")";
        }
    }

    /**
     * A tuple of 4 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     */
    public static class Tuple4<T1, T2, T3, T4> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;

        /**
         * Create Tuple4.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         */
        public Tuple4(T1 _1, T2 _2, T3 _3, T4 _4) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple4<?, ?, ?, ?> other = (Tuple4<?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ")";
        }
    }

    /**
     * A tuple of 5 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     */
    public static class Tuple5<T1, T2, T3, T4, T5> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;

        /**
         * Create Tuple5.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         */
        public Tuple5(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple5<?, ?, ?, ?, ?> other = (Tuple5<?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ")";
        }
    }

    /**
     * A tuple of 6 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     */
    public static class Tuple6<T1, T2, T3, T4, T5, T6> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;

        /**
         * Create Tuple6.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         */
        public Tuple6(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple6<?, ?, ?, ?, ?, ?> other = (Tuple6<?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ")";
        }
    }

    /**
     * A tuple of 7 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     */
    public static class Tuple7<T1, T2, T3, T4, T5, T6, T7> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;

        /**
         * Create Tuple7.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         */
        public Tuple7(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple7<?, ?, ?, ?, ?, ?, ?> other = (Tuple7<?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ")";
        }
    }

    /**
     * A tuple of 8 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     */
    public static class Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;

        /**
         * Create Tuple8.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         */
        public Tuple8(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple8<?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple8<?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ")";
        }
    }

    /**
     * A tuple of 9 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     */
    public static class Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;

        /**
         * Create Tuple9.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         */
        public Tuple9(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple9<?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple9<?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ")";
        }
    }

    /**
     * A tuple of 10 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     */
    public static class Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;
        private final T10 _10;

        /**
         * Create Tuple10.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         * @param _10 Element 10 of this Tuple
         */
        public Tuple10(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
            this._10 = _10;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        /**
         * Get element 10 of this Tuple.
         *
         * @return element 10
         */
        public T10 _10() {
            return _10;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            hash = 59 * hash + Objects.hashCode(this._10);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple10<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple10<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            if (!Objects.equals(this._10, other._10)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ", " + _10 + ")";
        }
    }

    /**
     * A tuple of 11 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     */
    public static class Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;
        private final T10 _10;
        private final T11 _11;

        /**
         * Create Tuple11.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         * @param _10 Element 10 of this Tuple
         * @param _11 Element 11 of this Tuple
         */
        public Tuple11(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
            this._10 = _10;
            this._11 = _11;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        /**
         * Get element 10 of this Tuple.
         *
         * @return element 10
         */
        public T10 _10() {
            return _10;
        }

        /**
         * Get element 11 of this Tuple.
         *
         * @return element 11
         */
        public T11 _11() {
            return _11;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            hash = 59 * hash + Objects.hashCode(this._10);
            hash = 59 * hash + Objects.hashCode(this._11);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple11<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple11<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            if (!Objects.equals(this._10, other._10)) {
                return false;
            }
            if (!Objects.equals(this._11, other._11)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ", " + _10 + ", " + _11 + ")";
        }
    }

    /**
     * A tuple of 12 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     */
    public static class Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;
        private final T10 _10;
        private final T11 _11;
        private final T12 _12;

        /**
         * Create Tuple12.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         * @param _10 Element 10 of this Tuple
         * @param _11 Element 11 of this Tuple
         * @param _12 Element 12 of this Tuple
         */
        public Tuple12(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
            this._10 = _10;
            this._11 = _11;
            this._12 = _12;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        /**
         * Get element 10 of this Tuple.
         *
         * @return element 10
         */
        public T10 _10() {
            return _10;
        }

        /**
         * Get element 11 of this Tuple.
         *
         * @return element 11
         */
        public T11 _11() {
            return _11;
        }

        /**
         * Get element 12 of this Tuple.
         *
         * @return element 12
         */
        public T12 _12() {
            return _12;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            hash = 59 * hash + Objects.hashCode(this._10);
            hash = 59 * hash + Objects.hashCode(this._11);
            hash = 59 * hash + Objects.hashCode(this._12);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple12<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple12<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            if (!Objects.equals(this._10, other._10)) {
                return false;
            }
            if (!Objects.equals(this._11, other._11)) {
                return false;
            }
            if (!Objects.equals(this._12, other._12)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ", " + _10 + ", " + _11 + ", " + _12 + ")";
        }
    }

    /**
     * A tuple of 13 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     */
    public static class Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;
        private final T10 _10;
        private final T11 _11;
        private final T12 _12;
        private final T13 _13;

        /**
         * Create Tuple13.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         * @param _10 Element 10 of this Tuple
         * @param _11 Element 11 of this Tuple
         * @param _12 Element 12 of this Tuple
         * @param _13 Element 13 of this Tuple
         */
        public Tuple13(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
            this._10 = _10;
            this._11 = _11;
            this._12 = _12;
            this._13 = _13;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        /**
         * Get element 10 of this Tuple.
         *
         * @return element 10
         */
        public T10 _10() {
            return _10;
        }

        /**
         * Get element 11 of this Tuple.
         *
         * @return element 11
         */
        public T11 _11() {
            return _11;
        }

        /**
         * Get element 12 of this Tuple.
         *
         * @return element 12
         */
        public T12 _12() {
            return _12;
        }

        /**
         * Get element 13 of this Tuple.
         *
         * @return element 13
         */
        public T13 _13() {
            return _13;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            hash = 59 * hash + Objects.hashCode(this._10);
            hash = 59 * hash + Objects.hashCode(this._11);
            hash = 59 * hash + Objects.hashCode(this._12);
            hash = 59 * hash + Objects.hashCode(this._13);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple13<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple13<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            if (!Objects.equals(this._10, other._10)) {
                return false;
            }
            if (!Objects.equals(this._11, other._11)) {
                return false;
            }
            if (!Objects.equals(this._12, other._12)) {
                return false;
            }
            if (!Objects.equals(this._13, other._13)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ", " + _10 + ", " + _11 + ", " + _12 + ", " + _13 + ")";
        }
    }

    /**
     * A tuple of 14 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     */
    public static class Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;
        private final T10 _10;
        private final T11 _11;
        private final T12 _12;
        private final T13 _13;
        private final T14 _14;

        /**
         * Create Tuple14.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         * @param _10 Element 10 of this Tuple
         * @param _11 Element 11 of this Tuple
         * @param _12 Element 12 of this Tuple
         * @param _13 Element 13 of this Tuple
         * @param _14 Element 14 of this Tuple
         */
        public Tuple14(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
            this._10 = _10;
            this._11 = _11;
            this._12 = _12;
            this._13 = _13;
            this._14 = _14;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        /**
         * Get element 10 of this Tuple.
         *
         * @return element 10
         */
        public T10 _10() {
            return _10;
        }

        /**
         * Get element 11 of this Tuple.
         *
         * @return element 11
         */
        public T11 _11() {
            return _11;
        }

        /**
         * Get element 12 of this Tuple.
         *
         * @return element 12
         */
        public T12 _12() {
            return _12;
        }

        /**
         * Get element 13 of this Tuple.
         *
         * @return element 13
         */
        public T13 _13() {
            return _13;
        }

        /**
         * Get element 14 of this Tuple.
         *
         * @return element 14
         */
        public T14 _14() {
            return _14;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            hash = 59 * hash + Objects.hashCode(this._10);
            hash = 59 * hash + Objects.hashCode(this._11);
            hash = 59 * hash + Objects.hashCode(this._12);
            hash = 59 * hash + Objects.hashCode(this._13);
            hash = 59 * hash + Objects.hashCode(this._14);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple14<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple14<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            if (!Objects.equals(this._10, other._10)) {
                return false;
            }
            if (!Objects.equals(this._11, other._11)) {
                return false;
            }
            if (!Objects.equals(this._12, other._12)) {
                return false;
            }
            if (!Objects.equals(this._13, other._13)) {
                return false;
            }
            if (!Objects.equals(this._14, other._14)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ", " + _10 + ", " + _11 + ", " + _12 + ", " + _13 + ", " + _14 + ")";
        }
    }

    /**
     * A tuple of 15 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     */
    public static class Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;
        private final T10 _10;
        private final T11 _11;
        private final T12 _12;
        private final T13 _13;
        private final T14 _14;
        private final T15 _15;

        /**
         * Create Tuple15.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         * @param _10 Element 10 of this Tuple
         * @param _11 Element 11 of this Tuple
         * @param _12 Element 12 of this Tuple
         * @param _13 Element 13 of this Tuple
         * @param _14 Element 14 of this Tuple
         * @param _15 Element 15 of this Tuple
         */
        public Tuple15(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
            this._10 = _10;
            this._11 = _11;
            this._12 = _12;
            this._13 = _13;
            this._14 = _14;
            this._15 = _15;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        /**
         * Get element 10 of this Tuple.
         *
         * @return element 10
         */
        public T10 _10() {
            return _10;
        }

        /**
         * Get element 11 of this Tuple.
         *
         * @return element 11
         */
        public T11 _11() {
            return _11;
        }

        /**
         * Get element 12 of this Tuple.
         *
         * @return element 12
         */
        public T12 _12() {
            return _12;
        }

        /**
         * Get element 13 of this Tuple.
         *
         * @return element 13
         */
        public T13 _13() {
            return _13;
        }

        /**
         * Get element 14 of this Tuple.
         *
         * @return element 14
         */
        public T14 _14() {
            return _14;
        }

        /**
         * Get element 15 of this Tuple.
         *
         * @return element 15
         */
        public T15 _15() {
            return _15;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            hash = 59 * hash + Objects.hashCode(this._10);
            hash = 59 * hash + Objects.hashCode(this._11);
            hash = 59 * hash + Objects.hashCode(this._12);
            hash = 59 * hash + Objects.hashCode(this._13);
            hash = 59 * hash + Objects.hashCode(this._14);
            hash = 59 * hash + Objects.hashCode(this._15);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple15<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple15<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            if (!Objects.equals(this._10, other._10)) {
                return false;
            }
            if (!Objects.equals(this._11, other._11)) {
                return false;
            }
            if (!Objects.equals(this._12, other._12)) {
                return false;
            }
            if (!Objects.equals(this._13, other._13)) {
                return false;
            }
            if (!Objects.equals(this._14, other._14)) {
                return false;
            }
            if (!Objects.equals(this._15, other._15)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ", " + _10 + ", " + _11 + ", " + _12 + ", " + _13 + ", " + _14 + ", " + _15 + ")";
        }
    }

    /**
     * A tuple of 16 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param <T16> Type 16 of this Tuple
     */
    public static class Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;
        private final T10 _10;
        private final T11 _11;
        private final T12 _12;
        private final T13 _13;
        private final T14 _14;
        private final T15 _15;
        private final T16 _16;

        /**
         * Create Tuple16.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         * @param _10 Element 10 of this Tuple
         * @param _11 Element 11 of this Tuple
         * @param _12 Element 12 of this Tuple
         * @param _13 Element 13 of this Tuple
         * @param _14 Element 14 of this Tuple
         * @param _15 Element 15 of this Tuple
         * @param _16 Element 16 of this Tuple
         */
        public Tuple16(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
            this._10 = _10;
            this._11 = _11;
            this._12 = _12;
            this._13 = _13;
            this._14 = _14;
            this._15 = _15;
            this._16 = _16;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        /**
         * Get element 10 of this Tuple.
         *
         * @return element 10
         */
        public T10 _10() {
            return _10;
        }

        /**
         * Get element 11 of this Tuple.
         *
         * @return element 11
         */
        public T11 _11() {
            return _11;
        }

        /**
         * Get element 12 of this Tuple.
         *
         * @return element 12
         */
        public T12 _12() {
            return _12;
        }

        /**
         * Get element 13 of this Tuple.
         *
         * @return element 13
         */
        public T13 _13() {
            return _13;
        }

        /**
         * Get element 14 of this Tuple.
         *
         * @return element 14
         */
        public T14 _14() {
            return _14;
        }

        /**
         * Get element 15 of this Tuple.
         *
         * @return element 15
         */
        public T15 _15() {
            return _15;
        }

        /**
         * Get element 16 of this Tuple.
         *
         * @return element 16
         */
        public T16 _16() {
            return _16;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            hash = 59 * hash + Objects.hashCode(this._10);
            hash = 59 * hash + Objects.hashCode(this._11);
            hash = 59 * hash + Objects.hashCode(this._12);
            hash = 59 * hash + Objects.hashCode(this._13);
            hash = 59 * hash + Objects.hashCode(this._14);
            hash = 59 * hash + Objects.hashCode(this._15);
            hash = 59 * hash + Objects.hashCode(this._16);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple16<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple16<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            if (!Objects.equals(this._10, other._10)) {
                return false;
            }
            if (!Objects.equals(this._11, other._11)) {
                return false;
            }
            if (!Objects.equals(this._12, other._12)) {
                return false;
            }
            if (!Objects.equals(this._13, other._13)) {
                return false;
            }
            if (!Objects.equals(this._14, other._14)) {
                return false;
            }
            if (!Objects.equals(this._15, other._15)) {
                return false;
            }
            if (!Objects.equals(this._16, other._16)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ", " + _10 + ", " + _11 + ", " + _12 + ", " + _13 + ", " + _14 + ", " + _15 + ", " + _16 + ")";
        }
    }

    /**
     * A tuple of 17 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param <T16> Type 16 of this Tuple
     * @param <T17> Type 17 of this Tuple
     */
    public static class Tuple17<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;
        private final T10 _10;
        private final T11 _11;
        private final T12 _12;
        private final T13 _13;
        private final T14 _14;
        private final T15 _15;
        private final T16 _16;
        private final T17 _17;

        /**
         * Create Tuple17.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         * @param _10 Element 10 of this Tuple
         * @param _11 Element 11 of this Tuple
         * @param _12 Element 12 of this Tuple
         * @param _13 Element 13 of this Tuple
         * @param _14 Element 14 of this Tuple
         * @param _15 Element 15 of this Tuple
         * @param _16 Element 16 of this Tuple
         * @param _17 Element 17 of this Tuple
         */
        public Tuple17(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
            this._10 = _10;
            this._11 = _11;
            this._12 = _12;
            this._13 = _13;
            this._14 = _14;
            this._15 = _15;
            this._16 = _16;
            this._17 = _17;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        /**
         * Get element 10 of this Tuple.
         *
         * @return element 10
         */
        public T10 _10() {
            return _10;
        }

        /**
         * Get element 11 of this Tuple.
         *
         * @return element 11
         */
        public T11 _11() {
            return _11;
        }

        /**
         * Get element 12 of this Tuple.
         *
         * @return element 12
         */
        public T12 _12() {
            return _12;
        }

        /**
         * Get element 13 of this Tuple.
         *
         * @return element 13
         */
        public T13 _13() {
            return _13;
        }

        /**
         * Get element 14 of this Tuple.
         *
         * @return element 14
         */
        public T14 _14() {
            return _14;
        }

        /**
         * Get element 15 of this Tuple.
         *
         * @return element 15
         */
        public T15 _15() {
            return _15;
        }

        /**
         * Get element 16 of this Tuple.
         *
         * @return element 16
         */
        public T16 _16() {
            return _16;
        }

        /**
         * Get element 17 of this Tuple.
         *
         * @return element 17
         */
        public T17 _17() {
            return _17;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            hash = 59 * hash + Objects.hashCode(this._10);
            hash = 59 * hash + Objects.hashCode(this._11);
            hash = 59 * hash + Objects.hashCode(this._12);
            hash = 59 * hash + Objects.hashCode(this._13);
            hash = 59 * hash + Objects.hashCode(this._14);
            hash = 59 * hash + Objects.hashCode(this._15);
            hash = 59 * hash + Objects.hashCode(this._16);
            hash = 59 * hash + Objects.hashCode(this._17);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple17<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple17<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            if (!Objects.equals(this._10, other._10)) {
                return false;
            }
            if (!Objects.equals(this._11, other._11)) {
                return false;
            }
            if (!Objects.equals(this._12, other._12)) {
                return false;
            }
            if (!Objects.equals(this._13, other._13)) {
                return false;
            }
            if (!Objects.equals(this._14, other._14)) {
                return false;
            }
            if (!Objects.equals(this._15, other._15)) {
                return false;
            }
            if (!Objects.equals(this._16, other._16)) {
                return false;
            }
            if (!Objects.equals(this._17, other._17)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ", " + _10 + ", " + _11 + ", " + _12 + ", " + _13 + ", " + _14 + ", " + _15 + ", " + _16 + ", " + _17 + ")";
        }
    }

    /**
     * A tuple of 18 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param <T16> Type 16 of this Tuple
     * @param <T17> Type 17 of this Tuple
     * @param <T18> Type 18 of this Tuple
     */
    public static class Tuple18<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;
        private final T10 _10;
        private final T11 _11;
        private final T12 _12;
        private final T13 _13;
        private final T14 _14;
        private final T15 _15;
        private final T16 _16;
        private final T17 _17;
        private final T18 _18;

        /**
         * Create Tuple18.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         * @param _10 Element 10 of this Tuple
         * @param _11 Element 11 of this Tuple
         * @param _12 Element 12 of this Tuple
         * @param _13 Element 13 of this Tuple
         * @param _14 Element 14 of this Tuple
         * @param _15 Element 15 of this Tuple
         * @param _16 Element 16 of this Tuple
         * @param _17 Element 17 of this Tuple
         * @param _18 Element 18 of this Tuple
         */
        public Tuple18(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
            this._10 = _10;
            this._11 = _11;
            this._12 = _12;
            this._13 = _13;
            this._14 = _14;
            this._15 = _15;
            this._16 = _16;
            this._17 = _17;
            this._18 = _18;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        /**
         * Get element 10 of this Tuple.
         *
         * @return element 10
         */
        public T10 _10() {
            return _10;
        }

        /**
         * Get element 11 of this Tuple.
         *
         * @return element 11
         */
        public T11 _11() {
            return _11;
        }

        /**
         * Get element 12 of this Tuple.
         *
         * @return element 12
         */
        public T12 _12() {
            return _12;
        }

        /**
         * Get element 13 of this Tuple.
         *
         * @return element 13
         */
        public T13 _13() {
            return _13;
        }

        /**
         * Get element 14 of this Tuple.
         *
         * @return element 14
         */
        public T14 _14() {
            return _14;
        }

        /**
         * Get element 15 of this Tuple.
         *
         * @return element 15
         */
        public T15 _15() {
            return _15;
        }

        /**
         * Get element 16 of this Tuple.
         *
         * @return element 16
         */
        public T16 _16() {
            return _16;
        }

        /**
         * Get element 17 of this Tuple.
         *
         * @return element 17
         */
        public T17 _17() {
            return _17;
        }

        /**
         * Get element 18 of this Tuple.
         *
         * @return element 18
         */
        public T18 _18() {
            return _18;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            hash = 59 * hash + Objects.hashCode(this._10);
            hash = 59 * hash + Objects.hashCode(this._11);
            hash = 59 * hash + Objects.hashCode(this._12);
            hash = 59 * hash + Objects.hashCode(this._13);
            hash = 59 * hash + Objects.hashCode(this._14);
            hash = 59 * hash + Objects.hashCode(this._15);
            hash = 59 * hash + Objects.hashCode(this._16);
            hash = 59 * hash + Objects.hashCode(this._17);
            hash = 59 * hash + Objects.hashCode(this._18);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple18<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple18<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            if (!Objects.equals(this._10, other._10)) {
                return false;
            }
            if (!Objects.equals(this._11, other._11)) {
                return false;
            }
            if (!Objects.equals(this._12, other._12)) {
                return false;
            }
            if (!Objects.equals(this._13, other._13)) {
                return false;
            }
            if (!Objects.equals(this._14, other._14)) {
                return false;
            }
            if (!Objects.equals(this._15, other._15)) {
                return false;
            }
            if (!Objects.equals(this._16, other._16)) {
                return false;
            }
            if (!Objects.equals(this._17, other._17)) {
                return false;
            }
            if (!Objects.equals(this._18, other._18)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ", " + _10 + ", " + _11 + ", " + _12 + ", " + _13 + ", " + _14 + ", " + _15 + ", " + _16 + ", " + _17 + ", " + _18 + ")";
        }
    }

    /**
     * A tuple of 19 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param <T16> Type 16 of this Tuple
     * @param <T17> Type 17 of this Tuple
     * @param <T18> Type 18 of this Tuple
     * @param <T19> Type 19 of this Tuple
     */
    public static class Tuple19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;
        private final T10 _10;
        private final T11 _11;
        private final T12 _12;
        private final T13 _13;
        private final T14 _14;
        private final T15 _15;
        private final T16 _16;
        private final T17 _17;
        private final T18 _18;
        private final T19 _19;

        /**
         * Create Tuple19.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         * @param _10 Element 10 of this Tuple
         * @param _11 Element 11 of this Tuple
         * @param _12 Element 12 of this Tuple
         * @param _13 Element 13 of this Tuple
         * @param _14 Element 14 of this Tuple
         * @param _15 Element 15 of this Tuple
         * @param _16 Element 16 of this Tuple
         * @param _17 Element 17 of this Tuple
         * @param _18 Element 18 of this Tuple
         * @param _19 Element 19 of this Tuple
         */
        public Tuple19(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18, T19 _19) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
            this._10 = _10;
            this._11 = _11;
            this._12 = _12;
            this._13 = _13;
            this._14 = _14;
            this._15 = _15;
            this._16 = _16;
            this._17 = _17;
            this._18 = _18;
            this._19 = _19;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        /**
         * Get element 10 of this Tuple.
         *
         * @return element 10
         */
        public T10 _10() {
            return _10;
        }

        /**
         * Get element 11 of this Tuple.
         *
         * @return element 11
         */
        public T11 _11() {
            return _11;
        }

        /**
         * Get element 12 of this Tuple.
         *
         * @return element 12
         */
        public T12 _12() {
            return _12;
        }

        /**
         * Get element 13 of this Tuple.
         *
         * @return element 13
         */
        public T13 _13() {
            return _13;
        }

        /**
         * Get element 14 of this Tuple.
         *
         * @return element 14
         */
        public T14 _14() {
            return _14;
        }

        /**
         * Get element 15 of this Tuple.
         *
         * @return element 15
         */
        public T15 _15() {
            return _15;
        }

        /**
         * Get element 16 of this Tuple.
         *
         * @return element 16
         */
        public T16 _16() {
            return _16;
        }

        /**
         * Get element 17 of this Tuple.
         *
         * @return element 17
         */
        public T17 _17() {
            return _17;
        }

        /**
         * Get element 18 of this Tuple.
         *
         * @return element 18
         */
        public T18 _18() {
            return _18;
        }

        /**
         * Get element 19 of this Tuple.
         *
         * @return element 19
         */
        public T19 _19() {
            return _19;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            hash = 59 * hash + Objects.hashCode(this._10);
            hash = 59 * hash + Objects.hashCode(this._11);
            hash = 59 * hash + Objects.hashCode(this._12);
            hash = 59 * hash + Objects.hashCode(this._13);
            hash = 59 * hash + Objects.hashCode(this._14);
            hash = 59 * hash + Objects.hashCode(this._15);
            hash = 59 * hash + Objects.hashCode(this._16);
            hash = 59 * hash + Objects.hashCode(this._17);
            hash = 59 * hash + Objects.hashCode(this._18);
            hash = 59 * hash + Objects.hashCode(this._19);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple19<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple19<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            if (!Objects.equals(this._10, other._10)) {
                return false;
            }
            if (!Objects.equals(this._11, other._11)) {
                return false;
            }
            if (!Objects.equals(this._12, other._12)) {
                return false;
            }
            if (!Objects.equals(this._13, other._13)) {
                return false;
            }
            if (!Objects.equals(this._14, other._14)) {
                return false;
            }
            if (!Objects.equals(this._15, other._15)) {
                return false;
            }
            if (!Objects.equals(this._16, other._16)) {
                return false;
            }
            if (!Objects.equals(this._17, other._17)) {
                return false;
            }
            if (!Objects.equals(this._18, other._18)) {
                return false;
            }
            if (!Objects.equals(this._19, other._19)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ", " + _10 + ", " + _11 + ", " + _12 + ", " + _13 + ", " + _14 + ", " + _15 + ", " + _16 + ", " + _17 + ", " + _18 + ", " + _19 + ")";
        }
    }

    /**
     * A tuple of 20 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param <T16> Type 16 of this Tuple
     * @param <T17> Type 17 of this Tuple
     * @param <T18> Type 18 of this Tuple
     * @param <T19> Type 19 of this Tuple
     * @param <T20> Type 20 of this Tuple
     */
    public static class Tuple20<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;
        private final T10 _10;
        private final T11 _11;
        private final T12 _12;
        private final T13 _13;
        private final T14 _14;
        private final T15 _15;
        private final T16 _16;
        private final T17 _17;
        private final T18 _18;
        private final T19 _19;
        private final T20 _20;

        /**
         * Create Tuple20.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         * @param _10 Element 10 of this Tuple
         * @param _11 Element 11 of this Tuple
         * @param _12 Element 12 of this Tuple
         * @param _13 Element 13 of this Tuple
         * @param _14 Element 14 of this Tuple
         * @param _15 Element 15 of this Tuple
         * @param _16 Element 16 of this Tuple
         * @param _17 Element 17 of this Tuple
         * @param _18 Element 18 of this Tuple
         * @param _19 Element 19 of this Tuple
         * @param _20 Element 20 of this Tuple
         */
        public Tuple20(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18, T19 _19, T20 _20) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
            this._10 = _10;
            this._11 = _11;
            this._12 = _12;
            this._13 = _13;
            this._14 = _14;
            this._15 = _15;
            this._16 = _16;
            this._17 = _17;
            this._18 = _18;
            this._19 = _19;
            this._20 = _20;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        /**
         * Get element 10 of this Tuple.
         *
         * @return element 10
         */
        public T10 _10() {
            return _10;
        }

        /**
         * Get element 11 of this Tuple.
         *
         * @return element 11
         */
        public T11 _11() {
            return _11;
        }

        /**
         * Get element 12 of this Tuple.
         *
         * @return element 12
         */
        public T12 _12() {
            return _12;
        }

        /**
         * Get element 13 of this Tuple.
         *
         * @return element 13
         */
        public T13 _13() {
            return _13;
        }

        /**
         * Get element 14 of this Tuple.
         *
         * @return element 14
         */
        public T14 _14() {
            return _14;
        }

        /**
         * Get element 15 of this Tuple.
         *
         * @return element 15
         */
        public T15 _15() {
            return _15;
        }

        /**
         * Get element 16 of this Tuple.
         *
         * @return element 16
         */
        public T16 _16() {
            return _16;
        }

        /**
         * Get element 17 of this Tuple.
         *
         * @return element 17
         */
        public T17 _17() {
            return _17;
        }

        /**
         * Get element 18 of this Tuple.
         *
         * @return element 18
         */
        public T18 _18() {
            return _18;
        }

        /**
         * Get element 19 of this Tuple.
         *
         * @return element 19
         */
        public T19 _19() {
            return _19;
        }

        /**
         * Get element 20 of this Tuple.
         *
         * @return element 20
         */
        public T20 _20() {
            return _20;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            hash = 59 * hash + Objects.hashCode(this._10);
            hash = 59 * hash + Objects.hashCode(this._11);
            hash = 59 * hash + Objects.hashCode(this._12);
            hash = 59 * hash + Objects.hashCode(this._13);
            hash = 59 * hash + Objects.hashCode(this._14);
            hash = 59 * hash + Objects.hashCode(this._15);
            hash = 59 * hash + Objects.hashCode(this._16);
            hash = 59 * hash + Objects.hashCode(this._17);
            hash = 59 * hash + Objects.hashCode(this._18);
            hash = 59 * hash + Objects.hashCode(this._19);
            hash = 59 * hash + Objects.hashCode(this._20);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple20<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple20<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            if (!Objects.equals(this._10, other._10)) {
                return false;
            }
            if (!Objects.equals(this._11, other._11)) {
                return false;
            }
            if (!Objects.equals(this._12, other._12)) {
                return false;
            }
            if (!Objects.equals(this._13, other._13)) {
                return false;
            }
            if (!Objects.equals(this._14, other._14)) {
                return false;
            }
            if (!Objects.equals(this._15, other._15)) {
                return false;
            }
            if (!Objects.equals(this._16, other._16)) {
                return false;
            }
            if (!Objects.equals(this._17, other._17)) {
                return false;
            }
            if (!Objects.equals(this._18, other._18)) {
                return false;
            }
            if (!Objects.equals(this._19, other._19)) {
                return false;
            }
            if (!Objects.equals(this._20, other._20)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ", " + _10 + ", " + _11 + ", " + _12 + ", " + _13 + ", " + _14 + ", " + _15 + ", " + _16 + ", " + _17 + ", " + _18 + ", " + _19 + ", " + _20 + ")";
        }
    }

    /**
     * A tuple of 21 elements.
     *
     * @param <T1> Type 1 of this Tuple
     * @param <T2> Type 2 of this Tuple
     * @param <T3> Type 3 of this Tuple
     * @param <T4> Type 4 of this Tuple
     * @param <T5> Type 5 of this Tuple
     * @param <T6> Type 6 of this Tuple
     * @param <T7> Type 7 of this Tuple
     * @param <T8> Type 8 of this Tuple
     * @param <T9> Type 9 of this Tuple
     * @param <T10> Type 10 of this Tuple
     * @param <T11> Type 11 of this Tuple
     * @param <T12> Type 12 of this Tuple
     * @param <T13> Type 13 of this Tuple
     * @param <T14> Type 14 of this Tuple
     * @param <T15> Type 15 of this Tuple
     * @param <T16> Type 16 of this Tuple
     * @param <T17> Type 17 of this Tuple
     * @param <T18> Type 18 of this Tuple
     * @param <T19> Type 19 of this Tuple
     * @param <T20> Type 20 of this Tuple
     * @param <T21> Type 21 of this Tuple
     */
    public static class Tuple21<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> implements Tuple {

        private final T1 _1;
        private final T2 _2;
        private final T3 _3;
        private final T4 _4;
        private final T5 _5;
        private final T6 _6;
        private final T7 _7;
        private final T8 _8;
        private final T9 _9;
        private final T10 _10;
        private final T11 _11;
        private final T12 _12;
        private final T13 _13;
        private final T14 _14;
        private final T15 _15;
        private final T16 _16;
        private final T17 _17;
        private final T18 _18;
        private final T19 _19;
        private final T20 _20;
        private final T21 _21;

        /**
         * Create Tuple21.
         *
         * @param _1 Element 1 of this Tuple
         * @param _2 Element 2 of this Tuple
         * @param _3 Element 3 of this Tuple
         * @param _4 Element 4 of this Tuple
         * @param _5 Element 5 of this Tuple
         * @param _6 Element 6 of this Tuple
         * @param _7 Element 7 of this Tuple
         * @param _8 Element 8 of this Tuple
         * @param _9 Element 9 of this Tuple
         * @param _10 Element 10 of this Tuple
         * @param _11 Element 11 of this Tuple
         * @param _12 Element 12 of this Tuple
         * @param _13 Element 13 of this Tuple
         * @param _14 Element 14 of this Tuple
         * @param _15 Element 15 of this Tuple
         * @param _16 Element 16 of this Tuple
         * @param _17 Element 17 of this Tuple
         * @param _18 Element 18 of this Tuple
         * @param _19 Element 19 of this Tuple
         * @param _20 Element 20 of this Tuple
         * @param _21 Element 21 of this Tuple
         */
        public Tuple21(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10, T11 _11, T12 _12, T13 _13, T14 _14, T15 _15, T16 _16, T17 _17, T18 _18, T19 _19, T20 _20, T21 _21) {
            this._1 = _1;
            this._2 = _2;
            this._3 = _3;
            this._4 = _4;
            this._5 = _5;
            this._6 = _6;
            this._7 = _7;
            this._8 = _8;
            this._9 = _9;
            this._10 = _10;
            this._11 = _11;
            this._12 = _12;
            this._13 = _13;
            this._14 = _14;
            this._15 = _15;
            this._16 = _16;
            this._17 = _17;
            this._18 = _18;
            this._19 = _19;
            this._20 = _20;
            this._21 = _21;
        }

        /**
         * Get element 1 of this Tuple.
         *
         * @return element 1
         */
        public T1 _1() {
            return _1;
        }

        /**
         * Get element 2 of this Tuple.
         *
         * @return element 2
         */
        public T2 _2() {
            return _2;
        }

        /**
         * Get element 3 of this Tuple.
         *
         * @return element 3
         */
        public T3 _3() {
            return _3;
        }

        /**
         * Get element 4 of this Tuple.
         *
         * @return element 4
         */
        public T4 _4() {
            return _4;
        }

        /**
         * Get element 5 of this Tuple.
         *
         * @return element 5
         */
        public T5 _5() {
            return _5;
        }

        /**
         * Get element 6 of this Tuple.
         *
         * @return element 6
         */
        public T6 _6() {
            return _6;
        }

        /**
         * Get element 7 of this Tuple.
         *
         * @return element 7
         */
        public T7 _7() {
            return _7;
        }

        /**
         * Get element 8 of this Tuple.
         *
         * @return element 8
         */
        public T8 _8() {
            return _8;
        }

        /**
         * Get element 9 of this Tuple.
         *
         * @return element 9
         */
        public T9 _9() {
            return _9;
        }

        /**
         * Get element 10 of this Tuple.
         *
         * @return element 10
         */
        public T10 _10() {
            return _10;
        }

        /**
         * Get element 11 of this Tuple.
         *
         * @return element 11
         */
        public T11 _11() {
            return _11;
        }

        /**
         * Get element 12 of this Tuple.
         *
         * @return element 12
         */
        public T12 _12() {
            return _12;
        }

        /**
         * Get element 13 of this Tuple.
         *
         * @return element 13
         */
        public T13 _13() {
            return _13;
        }

        /**
         * Get element 14 of this Tuple.
         *
         * @return element 14
         */
        public T14 _14() {
            return _14;
        }

        /**
         * Get element 15 of this Tuple.
         *
         * @return element 15
         */
        public T15 _15() {
            return _15;
        }

        /**
         * Get element 16 of this Tuple.
         *
         * @return element 16
         */
        public T16 _16() {
            return _16;
        }

        /**
         * Get element 17 of this Tuple.
         *
         * @return element 17
         */
        public T17 _17() {
            return _17;
        }

        /**
         * Get element 18 of this Tuple.
         *
         * @return element 18
         */
        public T18 _18() {
            return _18;
        }

        /**
         * Get element 19 of this Tuple.
         *
         * @return element 19
         */
        public T19 _19() {
            return _19;
        }

        /**
         * Get element 20 of this Tuple.
         *
         * @return element 20
         */
        public T20 _20() {
            return _20;
        }

        /**
         * Get element 21 of this Tuple.
         *
         * @return element 21
         */
        public T21 _21() {
            return _21;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 59 * hash + Objects.hashCode(this._1);
            hash = 59 * hash + Objects.hashCode(this._2);
            hash = 59 * hash + Objects.hashCode(this._3);
            hash = 59 * hash + Objects.hashCode(this._4);
            hash = 59 * hash + Objects.hashCode(this._5);
            hash = 59 * hash + Objects.hashCode(this._6);
            hash = 59 * hash + Objects.hashCode(this._7);
            hash = 59 * hash + Objects.hashCode(this._8);
            hash = 59 * hash + Objects.hashCode(this._9);
            hash = 59 * hash + Objects.hashCode(this._10);
            hash = 59 * hash + Objects.hashCode(this._11);
            hash = 59 * hash + Objects.hashCode(this._12);
            hash = 59 * hash + Objects.hashCode(this._13);
            hash = 59 * hash + Objects.hashCode(this._14);
            hash = 59 * hash + Objects.hashCode(this._15);
            hash = 59 * hash + Objects.hashCode(this._16);
            hash = 59 * hash + Objects.hashCode(this._17);
            hash = 59 * hash + Objects.hashCode(this._18);
            hash = 59 * hash + Objects.hashCode(this._19);
            hash = 59 * hash + Objects.hashCode(this._20);
            hash = 59 * hash + Objects.hashCode(this._21);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }

            final Tuple21<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> other = (Tuple21<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) obj;
            if (!Objects.equals(this._1, other._1)) {
                return false;
            }
            if (!Objects.equals(this._2, other._2)) {
                return false;
            }
            if (!Objects.equals(this._3, other._3)) {
                return false;
            }
            if (!Objects.equals(this._4, other._4)) {
                return false;
            }
            if (!Objects.equals(this._5, other._5)) {
                return false;
            }
            if (!Objects.equals(this._6, other._6)) {
                return false;
            }
            if (!Objects.equals(this._7, other._7)) {
                return false;
            }
            if (!Objects.equals(this._8, other._8)) {
                return false;
            }
            if (!Objects.equals(this._9, other._9)) {
                return false;
            }
            if (!Objects.equals(this._10, other._10)) {
                return false;
            }
            if (!Objects.equals(this._11, other._11)) {
                return false;
            }
            if (!Objects.equals(this._12, other._12)) {
                return false;
            }
            if (!Objects.equals(this._13, other._13)) {
                return false;
            }
            if (!Objects.equals(this._14, other._14)) {
                return false;
            }
            if (!Objects.equals(this._15, other._15)) {
                return false;
            }
            if (!Objects.equals(this._16, other._16)) {
                return false;
            }
            if (!Objects.equals(this._17, other._17)) {
                return false;
            }
            if (!Objects.equals(this._18, other._18)) {
                return false;
            }
            if (!Objects.equals(this._19, other._19)) {
                return false;
            }
            if (!Objects.equals(this._20, other._20)) {
                return false;
            }
            if (!Objects.equals(this._21, other._21)) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "(" + _1 + ", " + _2 + ", " + _3 + ", " + _4 + ", " + _5 + ", " + _6 + ", " + _7 + ", " + _8 + ", " + _9 + ", " + _10 + ", " + _11 + ", " + _12 + ", " + _13 + ", " + _14 + ", " + _15 + ", " + _16 + ", " + _17 + ", " + _18 + ", " + _19 + ", " + _20 + ", " + _21 + ")";
        }
    }

}
