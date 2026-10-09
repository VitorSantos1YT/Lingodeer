package com.google.firebase.components;

import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class RestrictedComponentContainer implements ComponentContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f18134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f18135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f18136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f18137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f18138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ComponentContainer f18139f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class RestrictedPublisher implements Publisher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Publisher f18140a;

        public RestrictedPublisher(Publisher publisher) {
            this.f18140a = publisher;
        }
    }

    public RestrictedComponentContainer(Component component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<Dependency> set = component.f18086c;
        Set set2 = component.f18090g;
        for (Dependency dependency : set) {
            int i11 = dependency.f18119c;
            int i12 = dependency.f18118b;
            boolean z11 = i11 == 0;
            Qualified qualified = dependency.f18117a;
            if (z11) {
                if (i12 == 2) {
                    hashSet4.add(qualified);
                } else {
                    hashSet.add(qualified);
                }
            } else if (i11 == 2) {
                hashSet3.add(qualified);
            } else if (i12 == 2) {
                hashSet5.add(qualified);
            } else {
                hashSet2.add(qualified);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(Qualified.a(Publisher.class));
        }
        this.f18134a = Collections.unmodifiableSet(hashSet);
        this.f18135b = Collections.unmodifiableSet(hashSet2);
        this.f18136c = Collections.unmodifiableSet(hashSet3);
        this.f18137d = Collections.unmodifiableSet(hashSet4);
        this.f18138e = Collections.unmodifiableSet(hashSet5);
        this.f18139f = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Object a(Class cls) {
        if (this.f18134a.contains(Qualified.a(cls))) {
            Object objA = this.f18139f.a(cls);
            return !cls.equals(Publisher.class) ? objA : new RestrictedPublisher((Publisher) objA);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Provider b(Qualified qualified) {
        if (this.f18135b.contains(qualified)) {
            return this.f18139f.b(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<" + qualified + ">.");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Provider c(Class cls) {
        return b(Qualified.a(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Set d(Qualified qualified) {
        if (this.f18137d.contains(qualified)) {
            return this.f18139f.d(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Set<" + qualified + ">.");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Provider e(Qualified qualified) {
        if (this.f18138e.contains(qualified)) {
            return this.f18139f.e(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + qualified + ">>.");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Object f(Qualified qualified) {
        if (this.f18134a.contains(qualified)) {
            return this.f18139f.f(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency " + qualified + ".");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Deferred h(Qualified qualified) {
        if (this.f18136c.contains(qualified)) {
            return this.f18139f.h(qualified);
        }
        throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + qualified + ">.");
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final Deferred i(Class cls) {
        return h(Qualified.a(cls));
    }
}
