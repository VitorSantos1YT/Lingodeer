package com.google.firebase.database.snapshot;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NodeUtilities {
    public static Node a(Object obj, Node node) {
        HashMap map;
        try {
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".priority")) {
                    node = PriorityUtilities.b(null, map2.get(".priority"));
                }
                if (map2.containsKey(".value")) {
                    obj = map2.get(".value");
                }
            }
            if (obj == null) {
                return EmptyNode.f19537e;
            }
            if (obj instanceof String) {
                return new StringNode((String) obj, node);
            }
            if (obj instanceof Long) {
                return new LongNode((Long) obj, node);
            }
            if (obj instanceof Integer) {
                return new LongNode(Long.valueOf(((Integer) obj).intValue()), node);
            }
            if (obj instanceof Double) {
                return new DoubleNode((Double) obj, node);
            }
            if (obj instanceof Boolean) {
                return new BooleanNode((Boolean) obj, node);
            }
            if (!(obj instanceof Map) && !(obj instanceof List)) {
                throw new DatabaseException("Failed to parse node with class " + obj.getClass().toString());
            }
            if (obj instanceof Map) {
                Map map3 = (Map) obj;
                if (map3.containsKey(".sv")) {
                    return new DeferredValueNode(map3, node);
                }
                map = new HashMap(map3.size());
                for (String str : map3.keySet()) {
                    if (!str.startsWith(".")) {
                        Node nodeA = a(map3.get(str), EmptyNode.f19537e);
                        if (!nodeA.isEmpty()) {
                            map.put(ChildKey.b(str), nodeA);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                map = new HashMap(list.size());
                for (int i11 = 0; i11 < list.size(); i11++) {
                    String str2 = BuildConfig.VERSION_NAME + i11;
                    Node nodeA2 = a(list.get(i11), EmptyNode.f19537e);
                    if (!nodeA2.isEmpty()) {
                        map.put(ChildKey.b(str2), nodeA2);
                    }
                }
            }
            return map.isEmpty() ? EmptyNode.f19537e : new ChildrenNode(ImmutableSortedMap.Builder.a(map, ChildrenNode.f19515d), node);
        } catch (ClassCastException e8) {
            throw new DatabaseException("Failed to parse node", e8);
        }
    }
}
