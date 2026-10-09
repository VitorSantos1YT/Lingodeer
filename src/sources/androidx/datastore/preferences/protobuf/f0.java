package androidx.datastore.preferences.protobuf;

import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 BOOLEAN;
    public static final f0 BYTE_STRING;
    public static final f0 DOUBLE;
    public static final f0 ENUM;
    public static final f0 FLOAT;
    public static final f0 INT;
    public static final f0 LONG;
    public static final f0 MESSAGE;
    public static final f0 STRING;
    public static final f0 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        f0 f0Var = new f0("VOID", 0, Void.class, Void.class, null);
        VOID = f0Var;
        Class cls = Integer.TYPE;
        f0 f0Var2 = new f0("INT", 1, cls, Integer.class, 0);
        INT = f0Var2;
        f0 f0Var3 = new f0("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = f0Var3;
        f0 f0Var4 = new f0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO));
        FLOAT = f0Var4;
        f0 f0Var5 = new f0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = f0Var5;
        f0 f0Var6 = new f0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = f0Var6;
        f0 f0Var7 = new f0("STRING", 6, String.class, String.class, BuildConfig.VERSION_NAME);
        STRING = f0Var7;
        f0 f0Var8 = new f0("BYTE_STRING", 7, i.class, i.class, i.f1484b);
        BYTE_STRING = f0Var8;
        f0 f0Var9 = new f0("ENUM", 8, cls, Integer.class, null);
        ENUM = f0Var9;
        f0 f0Var10 = new f0("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = f0Var10;
        $VALUES = new f0[]{f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7, f0Var8, f0Var9, f0Var10};
    }

    public f0(String str, int i11, Class cls, Class cls2, Serializable serializable) {
        super(str, i11);
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }

    public final Class a() {
        return this.boxedType;
    }
}
