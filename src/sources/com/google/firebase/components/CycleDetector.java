package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class CycleDetector {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ComponentNode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Component f18112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet f18113b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashSet f18114c = new HashSet();

        public ComponentNode(Component component) {
            this.f18112a = component;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Dep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Qualified f18115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18116b;

        public Dep(Qualified qualified, boolean z11) {
            this.f18115a = qualified;
            this.f18116b = z11;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Dep) {
                Dep dep = (Dep) obj;
                if (dep.f18115a.equals(this.f18115a) && dep.f18116b == this.f18116b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((this.f18115a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f18116b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            Component component = (Component) obj;
            ComponentNode componentNode = new ComponentNode(component);
            for (Qualified qualified : component.f18085b) {
                boolean z11 = component.f18088e == 0;
                Dep dep = new Dep(qualified, !z11);
                if (!map.containsKey(dep)) {
                    map.put(dep, new HashSet());
                }
                Set set = (Set) map.get(dep);
                if (!set.isEmpty() && z11) {
                    throw new IllegalArgumentException("Multiple components provide " + qualified + ".");
                }
                set.add(componentNode);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (ComponentNode componentNode2 : (Set) it.next()) {
                for (Dependency dependency : componentNode2.f18112a.f18086c) {
                    if (dependency.f18119c == 0) {
                        Set<ComponentNode> set2 = (Set) map.get(new Dep(dependency.f18117a, dependency.f18118b == 2));
                        if (set2 != null) {
                            for (ComponentNode componentNode3 : set2) {
                                componentNode2.f18113b.add(componentNode3);
                                componentNode3.f18114c.add(componentNode2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<ComponentNode> hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        for (ComponentNode componentNode4 : hashSet) {
            if (componentNode4.f18114c.isEmpty()) {
                hashSet2.add(componentNode4);
            }
        }
        while (!hashSet2.isEmpty()) {
            ComponentNode componentNode5 = (ComponentNode) hashSet2.iterator().next();
            hashSet2.remove(componentNode5);
            i11++;
            for (ComponentNode componentNode6 : componentNode5.f18113b) {
                componentNode6.f18114c.remove(componentNode5);
                if (componentNode6.f18114c.isEmpty()) {
                    hashSet2.add(componentNode6);
                }
            }
        }
        if (i11 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ComponentNode componentNode7 : hashSet) {
            if (!componentNode7.f18114c.isEmpty() && !componentNode7.f18113b.isEmpty()) {
                arrayList2.add(componentNode7.f18112a);
            }
        }
        throw new DependencyCycleException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }
}
