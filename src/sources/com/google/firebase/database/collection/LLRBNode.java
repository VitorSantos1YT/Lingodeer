package com.google.firebase.database.collection;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface LLRBNode<K, V> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Color {
        private static final /* synthetic */ Color[] $VALUES;
        public static final Color BLACK;
        public static final Color RED;

        static {
            Color color = new Color("RED", 0);
            RED = color;
            Color color2 = new Color("BLACK", 1);
            BLACK = color2;
            $VALUES = new Color[]{color, color2};
        }

        public static Color valueOf(String str) {
            return (Color) Enum.valueOf(Color.class, str);
        }

        public static Color[] values() {
            return (Color[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class NodeVisitor<K, V> implements ShortCircuitingNodeVisitor<K, V> {
        public abstract void a(Object obj, Object obj2);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ShortCircuitingNodeVisitor<K, V> {
    }

    LLRBNode a();

    LLRBNode b(Object obj, Object obj2, Comparator comparator);

    LLRBNode c(Color color, LLRBValueNode lLRBValueNode, LLRBValueNode lLRBValueNode2);

    LLRBNode d(Object obj, Comparator comparator);

    void e(NodeVisitor nodeVisitor);

    boolean f();

    LLRBNode g();

    Object getKey();

    Object getValue();

    LLRBNode h();

    LLRBNode i();

    boolean isEmpty();

    int size();
}
