package com.google.firebase.inappmessaging.model;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Action {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f20274b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Button f20276b;
    }

    public Action(String str, Button button) {
        this.f20273a = str;
        this.f20274b = button;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        Button button = action.f20274b;
        String str = action.f20273a;
        if (hashCode() != action.hashCode()) {
            return false;
        }
        String str2 = this.f20273a;
        if ((str2 == null && str != null) || (str2 != null && !str2.equals(str))) {
            return false;
        }
        Button button2 = this.f20274b;
        return (button2 == null && button == null) || (button2 != null && button2.equals(button));
    }

    public final int hashCode() {
        String str = this.f20273a;
        int iHashCode = str != null ? str.hashCode() : 0;
        Button button = this.f20274b;
        return iHashCode + (button != null ? button.hashCode() : 0);
    }
}
