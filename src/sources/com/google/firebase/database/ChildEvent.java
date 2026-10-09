package com.google.firebase.database;

import hh.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ChildEvent {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Added extends ChildEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Added) && m.a(null, null) && m.a(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Added(snapshot=");
            sb2.append((Object) null);
            sb2.append(", previousChildName=");
            return p0.o(sb2, null, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Changed extends ChildEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Changed) && m.a(null, null) && m.a(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Changed(snapshot=");
            sb2.append((Object) null);
            sb2.append(", previousChildName=");
            return p0.o(sb2, null, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Moved extends ChildEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Moved) && m.a(null, null) && m.a(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Moved(snapshot=");
            sb2.append((Object) null);
            sb2.append(", previousChildName=");
            return p0.o(sb2, null, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Removed extends ChildEvent {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Removed) && m.a(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Removed(snapshot=" + ((Object) null) + ')';
        }
    }

    private ChildEvent() {
    }
}
