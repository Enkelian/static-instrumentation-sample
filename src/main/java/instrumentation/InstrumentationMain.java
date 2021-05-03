package instrumentation;

import main.Robot;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;

import java.io.File;
import java.io.IOException;

public class InstrumentationMain {

    public static void main(String[] args) throws IOException {
        var type = new ByteBuddy()
                .redefine(Robot.class) // TODO: here class is loaded, should we work with unloaded classes?
                .visit(Advice.to(MyAdvices.class).on(ElementMatchers.isMethod()))
                .make()
                .inject(new File(System.getProperty("user.dir") + "/out/artifacts/byte_buddy_jar/byte-buddy.jar"));
    }
}
