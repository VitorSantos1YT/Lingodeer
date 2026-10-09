package com.google.firebase.platforminfo;

import android.content.Context;
import androidx.lifecycle.viewmodel.compose.c;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LibraryVersionComponent {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface VersionExtractor<T> {
        String f(Context context);
    }

    private LibraryVersionComponent() {
    }

    public static Component a(String str, String str2) {
        AutoValue_LibraryVersion autoValue_LibraryVersion = new AutoValue_LibraryVersion(str, str2);
        Component.Builder builderB = Component.b(LibraryVersion.class);
        builderB.f18095e = 1;
        builderB.f18096f = new c(autoValue_LibraryVersion);
        return builderB.b();
    }

    public static Component b(final String str, final VersionExtractor versionExtractor) {
        Component.Builder builderB = Component.b(LibraryVersion.class);
        builderB.f18095e = 1;
        builderB.a(Dependency.d(Context.class));
        builderB.f18096f = new ComponentFactory() { // from class: com.google.firebase.platforminfo.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object d(ComponentContainer componentContainer) {
                return new AutoValue_LibraryVersion(str, versionExtractor.f((Context) componentContainer.a(Context.class)));
            }
        };
        return builderB.b();
    }
}
