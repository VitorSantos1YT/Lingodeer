package com.google.firebase.components;

import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ComponentRuntime implements ComponentContainer, ComponentLoader {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f18100h = new b(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EventBus f18105e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ComponentRegistrarProcessor f18107g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18101a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18102b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f18103c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f18104d = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f18106f = new AtomicReference();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f18108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f18109b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f18110c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ComponentRegistrarProcessor f18111d = ComponentRegistrarProcessor.f18099r;

        public Builder(UiExecutor uiExecutor) {
            this.f18108a = uiExecutor;
        }
    }

    public ComponentRuntime(Executor executor, ArrayList arrayList, ArrayList arrayList2, ComponentRegistrarProcessor componentRegistrarProcessor) {
        EventBus eventBus = new EventBus(executor);
        this.f18105e = eventBus;
        this.f18107g = componentRegistrarProcessor;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Component.c(eventBus, EventBus.class, Subscriber.class, Publisher.class));
        int i11 = 0;
        arrayList3.add(Component.c(this, ComponentLoader.class, new Class[0]));
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            Component component = (Component) obj;
            if (component != null) {
                arrayList3.add(component);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Provider) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f18107g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it.remove();
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                for (Object obj3 : ((Component) it2.next()).f18085b.toArray()) {
                    if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f18104d.contains(obj3.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f18104d.add(obj3.toString());
                    }
                }
            }
            if (this.f18101a.isEmpty()) {
                CycleDetector.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f18101a.keySet());
                arrayList6.addAll(arrayList3);
                CycleDetector.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                final Component component2 = (Component) obj4;
                this.f18101a.put(component2, new Lazy(new Provider() { // from class: com.google.firebase.components.c
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        Component component3 = component2;
                        return component3.f18089f.d(new RestrictedComponentContainer(component3, this.f18144a));
                    }
                }));
            }
            arrayList5.addAll(l(arrayList3));
            arrayList5.addAll(m());
            k();
        }
        int size4 = arrayList5.size();
        while (i11 < size4) {
            Object obj5 = arrayList5.get(i11);
            i11++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f18106f.get();
        if (bool != null) {
            j(this.f18101a, bool.booleanValue());
        }
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final synchronized Provider b(Qualified qualified) {
        Preconditions.a(qualified, "Null interface requested.");
        return (Provider) this.f18102b.get(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final synchronized Provider e(Qualified qualified) {
        LazySet lazySet = (LazySet) this.f18103c.get(qualified);
        if (lazySet != null) {
            return lazySet;
        }
        return f18100h;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Deferred h(Qualified qualified) {
        Provider providerB = b(qualified);
        if (providerB == null) {
            return new OptionalProvider(OptionalProvider.f18128c, OptionalProvider.f18129d);
        }
        return providerB instanceof OptionalProvider ? (OptionalProvider) providerB : new OptionalProvider(null, providerB);
    }

    public final void j(HashMap map, boolean z11) {
        ArrayDeque<Event> arrayDeque;
        Set<Map.Entry> setEntrySet;
        for (Map.Entry entry : map.entrySet()) {
            Component component = (Component) entry.getKey();
            Provider provider = (Provider) entry.getValue();
            int i11 = component.f18087d;
            if (i11 == 1 || (i11 == 2 && z11)) {
                provider.get();
            }
        }
        EventBus eventBus = this.f18105e;
        synchronized (eventBus) {
            try {
                arrayDeque = eventBus.f18121b;
                if (arrayDeque != null) {
                    eventBus.f18121b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            for (Event event : arrayDeque) {
                event.getClass();
                synchronized (eventBus) {
                    try {
                        ArrayDeque arrayDeque2 = eventBus.f18121b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(event);
                        } else {
                            synchronized (eventBus) {
                                try {
                                    Map map2 = (Map) eventBus.f18120a.get(null);
                                    setEntrySet = map2 == null ? Collections.EMPTY_SET : map2.entrySet();
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            for (Map.Entry entry2 : setEntrySet) {
                                ((Executor) entry2.getValue()).execute(new d(2, entry2, event));
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
    }

    public final void k() {
        HashMap map = this.f18102b;
        HashMap map2 = this.f18103c;
        for (Component component : this.f18101a.keySet()) {
            for (Dependency dependency : component.f18086c) {
                boolean z11 = dependency.f18118b == 2;
                Qualified qualified = dependency.f18117a;
                if (z11 && !map2.containsKey(qualified)) {
                    Set set = Collections.EMPTY_SET;
                    LazySet lazySet = new LazySet();
                    lazySet.f18127b = null;
                    lazySet.f18126a = Collections.newSetFromMap(new ConcurrentHashMap());
                    lazySet.f18126a.addAll(set);
                    map2.put(qualified, lazySet);
                } else if (map.containsKey(qualified)) {
                    continue;
                } else {
                    int i11 = dependency.f18118b;
                    if (i11 == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + component + ": " + qualified);
                    }
                    if (i11 != 2) {
                        map.put(qualified, new OptionalProvider(OptionalProvider.f18128c, OptionalProvider.f18129d));
                    }
                }
            }
        }
    }

    public final ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Component component = (Component) obj;
            if (component.f18088e == 0) {
                Provider provider = (Provider) this.f18101a.get(component);
                for (Qualified qualified : component.f18085b) {
                    HashMap map = this.f18102b;
                    if (map.containsKey(qualified)) {
                        arrayList2.add(new d(0, (OptionalProvider) ((Provider) map.get(qualified)), provider));
                    } else {
                        map.put(qualified, provider);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList m() {
        HashMap map = this.f18103c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f18101a.entrySet()) {
            Component component = (Component) entry.getKey();
            if (component.f18088e != 0) {
                Provider provider = (Provider) entry.getValue();
                for (Qualified qualified : component.f18085b) {
                    if (!map2.containsKey(qualified)) {
                        map2.put(qualified, new HashSet());
                    }
                    ((Set) map2.get(qualified)).add(provider);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                LazySet lazySet = (LazySet) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new d(1, lazySet, (Provider) it.next()));
                }
            } else {
                Qualified qualified2 = (Qualified) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                LazySet lazySet2 = new LazySet();
                lazySet2.f18127b = null;
                lazySet2.f18126a = Collections.newSetFromMap(new ConcurrentHashMap());
                lazySet2.f18126a.addAll(set);
                map.put(qualified2, lazySet2);
            }
        }
        return arrayList;
    }
}
