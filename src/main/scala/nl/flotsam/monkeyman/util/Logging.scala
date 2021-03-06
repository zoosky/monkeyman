/*
 * Monkeyman static web site generator
 * Copyright (C) 2012  Wilfred Springer
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package nl.flotsam.monkeyman.util

import org.slf4j.LoggerFactory

trait Logging {

  lazy val logger = LoggerFactory.getLogger(getClass)

  def debug(message: => String, args: Any*) = logger.debug(message, args.toArray.map(_.asInstanceOf[AnyRef]).toArray[AnyRef])
  def info(message: => String, args: Any*)  = logger.info(message, args.map(_.asInstanceOf[AnyRef]).toArray[AnyRef])
  def warn(message: => String, args: Any*)  = logger.warn(message, args.map(_.asInstanceOf[AnyRef]).toArray[AnyRef])
  def warn(message: => String, e: Throwable)  = logger.warn(message, e)
  def error(message: => String) = logger.error(message)
  def error(message: => String, e : Throwable) = logger.error(message,e)

}
