package com.codeaffine.gonsole.internal;

import static com.google.common.collect.Iterables.toArray;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jgit.pgm.TextBuiltin;
import org.eclipse.jgit.pgm.opt.SubcommandHandler;
import org.kohsuke.args4j.Argument;


class CommandInfo {

  @Argument(index = 0, metaVar = "metaVar_command", required = true, handler = SubcommandHandler.class)
  TextBuiltin command;

  @Argument(index = 1, metaVar = "metaVar_arg")
  final List<String> arguments = new ArrayList<String>();

  TextBuiltin getCommand() {
    return command;
  }

  String[] getArguments() {
    return toArray( arguments, String.class );
  }
}