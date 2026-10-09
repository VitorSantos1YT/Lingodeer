package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Component<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f18085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f18086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ComponentFactory f18089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f18090g;

    public Component(String str, Set set, Set set2, int i11, int i12, ComponentFactory componentFactory, Set set3) {
        this.f18084a = str;
        this.f18085b = Collections.unmodifiableSet(set);
        this.f18086c = Collections.unmodifiableSet(set2);
        this.f18087d = i11;
        this.f18088e = i12;
        this.f18089f = componentFactory;
        this.f18090g = Collections.unmodifiableSet(set3);
    }

    public static Builder a(Qualified qualified) {
        return new Builder(qualified, new Qualified[0]);
    }

    public static Builder b(Class cls) {
        return new Builder(cls, new Class[0]);
    }

    public static Component c(Object obj, Class cls, Class... clsArr) {
        Builder builder = new Builder(cls, clsArr);
        builder.f18096f = new androidx.lifecycle.viewmodel.compose.c(obj);
        return builder.b();
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f18085b.toArray()) + ">{" + this.f18087d + ", type=" + this.f18088e + ", deps=" + Arrays.toString(this.f18086c.toArray()) + "}";
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18091a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet f18092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashSet f18093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ComponentFactory f18096f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HashSet f18097g;

        public Builder(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f18092b = hashSet;
            this.f18093c = new HashSet();
            this.f18094d = 0;
            this.f18095e = 0;
            this.f18097g = new HashSet();
            hashSet.add(Qualified.a(cls));
            for (Class cls2 : clsArr) {
                Preconditions.a(cls2, "Null interface");
                this.f18092b.add(Qualified.a(cls2));
            }
        }

        public final void a(Dependency dependency) {
            if (this.f18092b.contains(dependency.f18117a)) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f18093c.add(dependency);
        }

        public final Component b() {
            if (this.f18096f != null) {
                return new Component(this.f18091a, new HashSet(this.f18092b), new HashSet(this.f18093c), this.f18094d, this.f18095e, this.f18096f, this.f18097g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i11) {
            if (!(this.f18094d == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f18094d = i11;
        }

        public Builder(Qualified qualified, Qualified[] qualifiedArr) {
            HashSet hashSet = new HashSet();
            this.f18092b = hashSet;
            this.f18093c = new HashSet();
            this.f18094d = 0;
            this.f18095e = 0;
            this.f18097g = new HashSet();
            hashSet.add(qualified);
            for (Qualified qualified2 : qualifiedArr) {
                Preconditions.a(qualified2, "Null interface");
            }
            Collections.addAll(this.f18092b, qualifiedArr);
        }
    }
}
