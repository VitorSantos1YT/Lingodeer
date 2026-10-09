package com.google.android.material.color.utilities;

import com.google.errorprone.annotations.CheckReturnValue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
@Deprecated
public class Scheme {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof Scheme);
    }

    public final int hashCode() {
        return System.identityHashCode(this) * 11316127;
    }

    public final String toString() {
        return "Scheme{primary=0, onPrimary=0, primaryContainer=0, onPrimaryContainer=0, secondary=0, onSecondary=0, secondaryContainer=0, onSecondaryContainer=0, tertiary=0, onTertiary=0, tertiaryContainer=0, onTertiaryContainer=0, error=0, onError=0, errorContainer=0, onErrorContainer=0, background=0, onBackground=0, surface=0, onSurface=0, surfaceVariant=0, onSurfaceVariant=0, outline=0, outlineVariant=0, shadow=0, scrim=0, inverseSurface=0, inverseOnSurface=0, inversePrimary=0}";
    }
}
