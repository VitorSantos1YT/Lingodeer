package com.google.android.gms.internal.play_billing;

import defpackage.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfc {
    public static zzeu b() {
        String strM;
        ClassLoader classLoader = zzfc.class.getClassLoader();
        if (zzeu.class.equals(zzeu.class)) {
            strM = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!zzeu.class.getPackage().equals(zzfc.class.getPackage())) {
                throw new IllegalArgumentException(zzeu.class.getName());
            }
            strM = e.m(zzeu.class.getPackage().getName(), ".BlazeGeneratedzzeuLoader");
        }
        try {
            try {
                try {
                    try {
                        return (zzeu) zzeu.class.cast(((zzfc) Class.forName(strM, true, classLoader).getConstructor(null).newInstance(null)).a());
                    } catch (InvocationTargetException e8) {
                        throw new IllegalStateException(e8);
                    }
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (InstantiationException e11) {
                throw new IllegalStateException(e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException(e12);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzfc.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzeu) zzeu.class.cast(((zzfc) it.next()).a()));
                } catch (ServiceConfigurationError e13) {
                    Logger.getLogger(zzep.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zzeu"), (Throwable) e13);
                }
            }
            if (arrayList.size() == 1) {
                return (zzeu) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzeu) zzeu.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(e14);
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(e16);
            }
        }
    }

    public abstract zzeu a();
}
