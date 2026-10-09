package sa;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import nv.p;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f51520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f51521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f51522c;

    public a(e eVar, e eVar2, e eVar3) {
        this.f51520a = eVar;
        this.f51521b = eVar2;
        this.f51522c = eVar3;
    }

    public abstract b a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        e eVar = this.f51522c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(p.r(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        eVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        e eVar = this.f51520a;
        Method method = (Method) eVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        eVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        e eVar = this.f51521b;
        Method method = (Method) eVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, a.class);
        eVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i11);

    public final int f(int i11, int i12) {
        return !e(i12) ? i11 : ((b) this).f51524e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i11) {
        if (!e(i11)) {
            return parcelable;
        }
        return ((b) this).f51524e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String string = ((b) this).f51524e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (c) c(string).invoke(null, a());
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        }
    }

    public abstract void i(int i11);

    public final void j(int i11, int i12) {
        i(i12);
        ((b) this).f51524e.writeInt(i11);
    }

    public final void k(c cVar) {
        if (cVar == null) {
            ((b) this).f51524e.writeString(null);
            return;
        }
        try {
            ((b) this).f51524e.writeString(b(cVar.getClass()).getName());
            b bVarA = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, bVarA);
                Parcel parcel = bVarA.f51524e;
                int i11 = bVarA.f51528i;
                if (i11 >= 0) {
                    int i12 = bVarA.f51523d.get(i11);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i12);
                    parcel.writeInt(iDataPosition - i12);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e8) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e8);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
            } catch (InvocationTargetException e12) {
                if (!(e12.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
                }
                throw ((RuntimeException) e12.getCause());
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e13);
        }
    }
}
