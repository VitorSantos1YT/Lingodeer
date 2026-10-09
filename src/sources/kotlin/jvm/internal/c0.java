package kotlin.jvm.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 {
    public static Collection a(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof gz.a) || (abstractCollection instanceof gz.b)) {
            return abstractCollection;
        }
        f(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static List b(Object obj) {
        if ((obj instanceof gz.a) && !(obj instanceof gz.c)) {
            f(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e8) {
            m.j(e8, c0.class.getName());
            throw e8;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof gz.a) && !(obj instanceof gz.e)) {
            f(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e8) {
            m.j(e8, c0.class.getName());
            throw e8;
        }
    }

    public static void d(int i11, Object obj) {
        if (obj == null || e(i11, obj)) {
            return;
        }
        f(obj, "kotlin.jvm.functions.Function" + i11);
        throw null;
    }

    public static boolean e(int i11, Object obj) {
        int arity;
        if (obj instanceof qy.e) {
            if (obj instanceof h) {
                arity = ((h) obj).getArity();
            } else if (obj instanceof fz.a) {
                arity = 0;
            } else if (obj instanceof fz.c) {
                arity = 1;
            } else if (obj instanceof fz.e) {
                arity = 2;
            } else if (obj instanceof fz.f) {
                arity = 3;
            } else if (obj instanceof fz.g) {
                arity = 4;
            } else if (obj instanceof fz.h) {
                arity = 5;
            } else if (obj instanceof fz.i) {
                arity = 6;
            } else if (obj instanceof fz.j) {
                arity = 7;
            } else {
                boolean z11 = obj instanceof t1.c;
                if (z11) {
                    arity = 8;
                } else if (z11) {
                    arity = 9;
                } else if (z11) {
                    arity = 10;
                } else if (z11) {
                    arity = 11;
                } else if (z11) {
                    arity = 13;
                } else if (z11) {
                    arity = 14;
                } else if (z11) {
                    arity = 15;
                } else if (z11) {
                    arity = 16;
                } else if (z11) {
                    arity = 17;
                } else if (z11) {
                    arity = 18;
                } else if (z11) {
                    arity = 19;
                } else if (z11) {
                    arity = 20;
                } else {
                    arity = z11 ? 21 : -1;
                }
            }
            if (arity == i11) {
                return true;
            }
        }
        return false;
    }

    public static void f(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(ep.a.D(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        m.j(classCastException, c0.class.getName());
        throw classCastException;
    }
}
