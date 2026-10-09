package com.google.firebase.database.core;

import com.google.firebase.database.core.utilities.Clock;
import com.google.firebase.database.snapshot.Node;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ServerValues {
    public static HashMap a(Clock clock) {
        HashMap map = new HashMap();
        map.put("timestamp", Long.valueOf(clock.millis()));
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    public static Object b(Object obj, ValueProvider valueProvider, HashMap map) {
        Object objValueOf;
        Number number;
        Object obj2;
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map2 = (Map) obj;
        if (map2.containsKey(".sv")) {
            Object obj3 = map2.get(".sv");
            objValueOf = null;
            objValueOf = null;
            objValueOf = null;
            objValueOf = null;
            objValueOf = null;
            if (obj3 instanceof String) {
                String str = (String) obj3;
                if ("timestamp".equals(str) && map.containsKey(str)) {
                    obj2 = map.get(str);
                }
            } else if (obj3 instanceof Map) {
                Map map3 = (Map) obj3;
                if (map3.containsKey("increment")) {
                    Object obj4 = map3.get("increment");
                    if (obj4 instanceof Number) {
                        number = (Number) obj4;
                        Node nodeB = valueProvider.b();
                        if (nodeB.T0() && (nodeB.getValue() instanceof Number)) {
                            Number number2 = (Number) nodeB.getValue();
                            if ((number instanceof Double) || (number instanceof Float) || (number2 instanceof Double) || (number2 instanceof Float)) {
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = number;
                                objValueOf = Double.valueOf(number2.doubleValue() + number.doubleValue());
                            } else {
                                long jLongValue = number.longValue();
                                long jLongValue2 = number2.longValue();
                                long j11 = jLongValue + jLongValue2;
                                if (((jLongValue ^ j11) & (jLongValue2 ^ j11)) >= 0) {
                                    objValueOf = number;
                                    objValueOf = number;
                                    objValueOf = Long.valueOf(j11);
                                } else {
                                    objValueOf = number;
                                    objValueOf = number;
                                    objValueOf = number;
                                    objValueOf = number;
                                    objValueOf = number;
                                    objValueOf = number;
                                    objValueOf = number;
                                    objValueOf = number;
                                    objValueOf = number;
                                    objValueOf = number;
                                    objValueOf = Double.valueOf(number2.doubleValue() + number.doubleValue());
                                }
                            }
                        }
                    }
                }
            }
            if (objValueOf != null) {
                objValueOf = obj2;
                return objValueOf;
            }
        }
        objValueOf = obj2;
        return obj;
    }

    public static CompoundWrite c(CompoundWrite compoundWrite, SyncTree syncTree, Path path, HashMap map) {
        CompoundWrite compoundWriteB = CompoundWrite.f19184b;
        for (Map.Entry entry : compoundWrite.f19185a) {
            compoundWriteB = compoundWriteB.b((Path) entry.getKey(), d((Node) entry.getValue(), new ValueProvider.DeferredValueProvider(syncTree, path.e((Path) entry.getKey())), map));
        }
        return compoundWriteB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r4 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.firebase.database.snapshot.Node d(com.google.firebase.database.snapshot.Node r5, final com.google.firebase.database.core.ValueProvider r6, final java.util.HashMap r7) {
        /*
            com.google.firebase.database.snapshot.Node r0 = r5.y()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = ".priority"
            com.google.firebase.database.snapshot.ChildKey r1 = com.google.firebase.database.snapshot.ChildKey.b(r1)
            com.google.firebase.database.core.ValueProvider r1 = r6.a(r1)
            java.lang.Object r1 = b(r0, r1, r7)
            boolean r2 = r5.T0()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L48
            java.lang.Object r2 = r5.getValue()
            java.lang.Object r6 = b(r2, r6, r7)
            java.lang.Object r7 = r5.getValue()
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L3f
            if (r1 != r0) goto L34
            r4 = 1
            goto L3d
        L34:
            if (r1 == 0) goto L3d
            if (r0 != 0) goto L39
            goto L3d
        L39:
            boolean r4 = r1.equals(r0)
        L3d:
            if (r4 != 0) goto L4e
        L3f:
            com.google.firebase.database.snapshot.Node r5 = com.google.firebase.database.snapshot.PriorityUtilities.b(r3, r1)
            com.google.firebase.database.snapshot.Node r5 = com.google.firebase.database.snapshot.NodeUtilities.a(r6, r5)
            return r5
        L48:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L4f
        L4e:
            return r5
        L4f:
            com.google.firebase.database.snapshot.ChildrenNode r5 = (com.google.firebase.database.snapshot.ChildrenNode) r5
            com.google.firebase.database.core.SnapshotHolder r0 = new com.google.firebase.database.core.SnapshotHolder
            r0.<init>(r5)
            com.google.firebase.database.core.ServerValues$1 r2 = new com.google.firebase.database.core.ServerValues$1
            r2.<init>()
            r5.e(r2, r4)
            com.google.firebase.database.snapshot.Node r5 = r0.f19289a
            com.google.firebase.database.snapshot.Node r5 = r5.y()
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L75
            com.google.firebase.database.snapshot.Node r5 = r0.f19289a
            com.google.firebase.database.snapshot.Node r6 = com.google.firebase.database.snapshot.PriorityUtilities.b(r3, r1)
            com.google.firebase.database.snapshot.Node r5 = r5.S(r6)
            return r5
        L75:
            com.google.firebase.database.snapshot.Node r5 = r0.f19289a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.database.core.ServerValues.d(com.google.firebase.database.snapshot.Node, com.google.firebase.database.core.ValueProvider, java.util.HashMap):com.google.firebase.database.snapshot.Node");
    }
}
